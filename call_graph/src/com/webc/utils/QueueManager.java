/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webc.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.webc.databaseUtils.DataBaseManager;

/**
 *
 * @author vimal
 */
public class QueueManager {
    //private UrlQueue uq;
    private Queue<URL> queue;
    private DataBaseManager dbman;    
    
    public URL readnext(){
        return getQueue().remove();       
    }

    public Queue<URL> getQueue() {
        return queue;
    }

    public void setQueue(Queue<URL> queue) {
        this.queue = queue;
    }
    
    public boolean hasnext(){
        if(queue.isEmpty()) return false;
        else return true;
    }
    
    public QueueManager(DataBaseManager dbm) {
        queue = new LinkedList<URL>();
        this.dbman = dbm;
    }
    
    public void AddUrl(String StrUrl){
        
        URL tempURL = null;
        
        try {            
            tempURL = new URL(StrUrl);
           if(queue.contains(tempURL)){
                System.out.println("LINK ALREADY EXISTS IN QUEUE:" + StrUrl);
            }else{
                queue.add(tempURL);
                System.out.println("INSERT STMT = " + "INSERT INTO `webcrawler`.`links` (url) value('" + StrUrl + "');");
                if(null != tempURL) {
                    dbman.executeInsertQuery("INSERT INTO `webcrawler`.`links` (url) value('" + StrUrl + "');");
                    
                }
                System.out.println("NEW LINK ADDED:" + tempURL.toString());
                tempURL=null;
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(QueueManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("***LINK DROPPED***:" + StrUrl);
        }
    }
    
    public URL getNextUrl(){
        if(! queue.isEmpty()){
            return queue.remove();
        }else{
            System.out.println("RETURNING NULL FROM QUEUE.");
            System.out.println("[QUEUE-TOP]=="+queue.peek());
            return null;
        }
    }

    public DataBaseManager getDbman() {
        return dbman;
    }

    public void setDbman(DataBaseManager dbman) {
        this.dbman = dbman;
    }


    /*public UrlQueue getUq() {
    return uq;
    }
    
    public void setUq(UrlQueue uq) {
    this.uq = uq;
    }*/


}
