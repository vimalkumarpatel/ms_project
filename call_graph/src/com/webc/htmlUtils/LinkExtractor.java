/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webc.htmlUtils;

import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.webc.databaseUtils.DataBaseManager;
import com.webc.utils.QueueManager;

/**
 *
 * @author vimal
 */
public class LinkExtractor {
    private ArrayList<String> arrLstURL;
    private URL parentURL;
    private String htmlpage;
    private int URLcount;
    private QueueManager qm;
    private DataBaseManager dbman;    
    
    public LinkExtractor(String html,URL currURL,QueueManager qm,DataBaseManager dbman) {
        this.htmlpage = html;
        this.parentURL = currURL;
        this.arrLstURL = new ArrayList<String>();
        this.qm = qm;
        this.dbman = dbman;
        enlistURL(currURL.toString());
    }

    public ArrayList<String> getarrLstURL() {
        return arrLstURL;
    }

    public void setarrLstURL(ArrayList<String> hm) {
        this.arrLstURL = hm;
    }

    public URL getParentURL() {
        return parentURL;
    }

    public void setParentURL(URL currURL) {
        this.parentURL = currURL;
    }

    public int getURLcount() {
        return URLcount;
    }

    public void setURLcount(int URLcount) {
        this.URLcount = URLcount;
    }    
    
    public String getHtmlpage() {
        return htmlpage;
    }

    public void setHtmlpage(String htmlpage) {
        this.htmlpage = htmlpage;
    }

    public void findlinks() {
        int stPt=0,endPt=0;
        String temp=""; 
        //System.out.println(htmlpage);
        
        while(stPt!=-1){
            System.out.println("1>s,e="+stPt+","+endPt);
            if((stPt=htmlpage.indexOf("href=",stPt))==-1) {
                break;
            }
            
            stPt=stPt+"href=".length()+1;
            if((htmlpage.charAt(stPt-1) != '\'') && (htmlpage.charAt(stPt-1) != '\"' ) ){
                //skip this href tag;
                System.out.println("NOT A VALID LINK----------------------["+htmlpage.substring(stPt-6, stPt+2)+" ...]");
                if(stPt != -1 && endPt != -1 && stPt < endPt && endPt < htmlpage.length() ) {
                    System.out.println(htmlpage.substring(stPt, endPt));
                }
            }else{

                if((endPt=htmlpage.indexOf("\"",stPt+1))==-1){
                    if((endPt=htmlpage.indexOf("\'",stPt+1))==-1){
                    }
                }
                System.out.println("2>s,e="+stPt+","+endPt);
                temp=htmlpage.substring(stPt,endPt);
                System.out.println("----LINK#[" + URLcount + "]==["+stPt+"]["+endPt+"]:"+htmlpage.substring(stPt,endPt));
                enlistURL(htmlpage.substring(stPt,endPt));

            }            
        }        
    }

    void ValidateAllLinks() {
        URL tempurl;
        Object objlst[] = arrLstURL.toArray();
        ArrayList<String> newlst = new ArrayList<String>();
        int tempInt;
        int NoOfParent=0;
        for (int i = 0; i < objlst.length; i++) {
            String tempStr = objlst[i].toString();
            System.out.println("VALIDATING URL#" + i + ":" + tempStr);
            //try to make the url more complete before testing for exceptions
            tempStr.toLowerCase();
            if(! tempStr.startsWith("http://") && !tempStr.startsWith("https://")){
                //this means that its a relative link, 
                //so get the parent link and remove the last part & append this one.
                //also remove leading ".." from the url at hand.
                String currentDirPath = parentURL.toString().substring(0,parentURL.toString().lastIndexOf("/")+1 );
                if(tempStr.startsWith("..")){
                    while(tempStr.startsWith("..")){
                    tempStr = tempStr.substring(3,tempStr.length());
                    NoOfParent++;
                    }
                    NoOfParent--;
                    
                } else if(tempStr.startsWith("/")){
                    System.out.println("parent url=="+parentURL.toString());
                    tempStr = parentURL.getProtocol() + "://" + parentURL.getHost() + tempStr;//.substring(tempStr.indexOf("/") + 1 , tempStr.length());
                } else if((tempInt = tempStr.indexOf("#")) != -1){
                    tempStr = tempStr.substring(0,tempInt);
                } else if((tempInt = tempStr.indexOf("?")) != -1){
                    tempStr = tempStr.substring(0,tempInt);
                }
                
                for( ; NoOfParent != 0 ; NoOfParent-- ){
                    System.out.println("NoOfParent=="+NoOfParent + "currentDirPath=="+currentDirPath);
                    currentDirPath = currentDirPath.substring(0, currentDirPath.lastIndexOf("/"));
                    currentDirPath = currentDirPath.substring(0, currentDirPath.lastIndexOf("/"));                    
                    currentDirPath = currentDirPath.substring(0, currentDirPath.lastIndexOf("/")+1);
                }
                    tempStr = currentDirPath + tempStr;
                    System.out.println("THE NEW URL = " + tempStr);
                    arrLstURL.remove(i);
                    arrLstURL.add(i, tempStr);
            }        
            
            //now test if the URL class can accept this link.
            try {
                tempurl = new URL(tempStr);
                newlst.add(tempurl.getQuery());                
            } catch (Exception ex) {
                Logger.getLogger(LinkExtractor.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                arrLstURL.remove(i);
            }            
        }
        
        for(int i=0;i<arrLstURL.size();i++){            
            qm.AddUrl(arrLstURL.get(i).toString());
            
        }
        System.out.println("URL QUEUE SIZE ==" + qm.getQueue().size());        
        
    }

    private void enlistURL(String newURL) {
        arrLstURL.add(newURL);
        System.out.println("LINK PAIR = "+parentURL.toString()+","+newURL);
        dbman.executeInsertQuery("INSERT INTO `webcrawler`.`src_dest_url` values("+parentURL.toString()+","+newURL+");");
        //if( ! parentURL.toString().equals(newURL)) dbman.executeProcInsertLinkPair(parentURL.toString(),newURL);
        //else dbman.executeProcInsertLinkPair("NA",newURL);
        URLcount++;
    }

    public DataBaseManager getDbman() {
        return dbman;
    }

    public void setDbman(DataBaseManager dbman) {
        this.dbman = dbman;
    }


}
