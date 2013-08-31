/*
 * To change this template, choose Tools | Templates
 * and open the template buffIn the editor.
 */

package com.webc.downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.vimalpatel.test.A;

import com.webc.databaseUtils.*;

import com.webc.utils.*;
import com.webc.htmlUtils.*;

/**
 *
 * @author vimal
 */
public class HtmlDownloader implements Runnable {
//    private URL inpUrl = null;
    private BufferedReader buffIn;
    private String inputLine;
    private String htmlpage;
    private QueueManager qm;
    private DataExtractor de;
    private DataBaseManager dm;



    public HtmlDownloader(QueueManager qm, DataBaseManager db) {
        this.qm = qm;
        this.dm = db;
        de = new DataExtractor(dm);
    }
    
    public void run(){

        System.out.println("New Downloader Thread...");        
        for(;;){
            /*if(!qm.getUq().hasnext()){
            System.exit(1);
            }*/            
            try {
                String tempStrHtml = null;
                URL CurrUrl = null;                
                synchronized(qm){
                    CurrUrl = qm.getNextUrl();
                    if(null == CurrUrl){
                        System.out.println("NULL URL RETURN FROM QUEUEMANG...");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) { }
                    }
                }
                
                tempStrHtml = this.downloadPage(CurrUrl);
                System.out.println(tempStrHtml);
                new DataExtractor(tempStrHtml,CurrUrl,qm,dm).processpage();
            } catch (IOException ex) {
                Logger.getLogger(HtmlDownloader.class.getName()).log(Level.SEVERE, null, ex);
            }           

        }
    }//run() ends here
    
    public String downloadPage(URL StrUrl) throws IOException{
        String returnStrHtml = " ";
        String StrInput = null;
        
        setBuffIn(new BufferedReader(new InputStreamReader((StrUrl).openStream())));
        System.out.println("FileName=" + StrUrl);
        setInputLine("");
        setHtmlpage("");
        
        
        while ((StrInput = getBuffIn().readLine()) != null){
            returnStrHtml = returnStrHtml + StrInput + " ";
        }        
        getBuffIn().close();
        //System.out.println(returnStrHtml);
        return returnStrHtml;
    }

//    public URL getInpUrl() {
//        return inpUrl;
//    }
//
//    public void setInpUrl(URL inpUrl) {
//        this.inpUrl = inpUrl;
//    }

    public BufferedReader getBuffIn() {
        return buffIn;
    }

    public void setBuffIn(BufferedReader buffIn) {
        this.buffIn = buffIn;
    }

    public String getInputLine() {
        return inputLine;
    }

    public void setInputLine(String inputLine) {
        this.inputLine = inputLine;
    }

    public String getHtmlpage() {
        return htmlpage;
    }

    public void setHtmlpage(String htmlpage) {
        this.htmlpage = htmlpage;
    }

    public QueueManager getQm() {
        return qm;
    }


    public DataBaseManager getDm() {
        return dm;
    }



}
