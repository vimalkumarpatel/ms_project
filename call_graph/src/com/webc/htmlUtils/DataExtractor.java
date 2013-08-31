/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webc.htmlUtils;

import java.net.URL;

import net.vimalpatel.test.A;

import com.webc.databaseUtils.DataBaseManager;
import com.webc.utils.QueueManager;

/**
 *
 * @author vimal
 */
public class DataExtractor {
    private String htmlpage;
    private URL inpUrl;
    LinkExtractor le;
    TextExtractor te;
    private QueueManager qm;
    private DataBaseManager dbman;
    
    public DataExtractor(DataBaseManager dbman){
        this.dbman = dbman;
        int res = 6;
        if(6 < res){ 
        	//dont call the any thing that may lead to our target method B.methodB()
        	res++;
        }else{
//            A a = new A();
//    		a.methodA();
//    		a.methodA2();      
        }
    }
    public DataExtractor(String htmlpage,URL inpUrl,QueueManager qm,DataBaseManager dbman) {
        this.htmlpage = htmlpage;
        this.inpUrl = inpUrl;
        this.qm = qm;
        this.dbman = dbman;
    }
    
    public void processpage() {
        this.extractlinks();
        this.extracttext();        
    }

    public void extractlinks() {
        le = new LinkExtractor(getHtmlpage(), getInpUrl(), getQm(),getDbman());
        le.findlinks();
        
        /*ArrayList temp_arr = le.getarrLstURL();
        Object objArr[] = temp_arr.toArray();
        for(int i = 0 ; i < objArr.length ; i++){
        System.out.println(objArr[i]);
        }*/
        
        le.ValidateAllLinks();
        
    }
    
    public void extracttext(){
        te = new TextExtractor(getInpUrl().toString(),getHtmlpage(),getDbman());
        te.extracttext();
        //System.out.println(te.getHtmltext());
    }

    public String getHtmlpage() {
        return htmlpage;
    }

    public void setHtmlpage(String htmlpage) {
        this.htmlpage = htmlpage;
    }

    public URL getInpUrl() {
        return inpUrl;
    }

    public void setInpUrl(URL inpUrl) {
        this.inpUrl = inpUrl;
    }

    public QueueManager getQm() {
        return qm;
    }

    public void setQm(QueueManager qm) {
        this.qm = qm;
    }

    public DataBaseManager getDbman() {
        return dbman;
    }

    public void setDbman(DataBaseManager dbman) {
        this.dbman = dbman;
    }




}
