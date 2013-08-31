/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webc.utils;

import java.net.URL;
import java.util.*;

/**
 *
 * @author vimal
 */
public class UrlQueue {

    private Queue<URL> queue;
    public UrlQueue() {
        queue = new LinkedList<URL>();
    }
    public void add(URL newUrl){
        queue.add(newUrl);
        
    }
    
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

}
