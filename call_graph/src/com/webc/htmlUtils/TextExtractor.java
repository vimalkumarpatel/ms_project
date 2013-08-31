/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webc.htmlUtils;

import com.webc.databaseUtils.DataBaseManager;

/**
 *
 * @author vimal
 */
public class TextExtractor {

    private String htmlpage;
    private String htmltext;
    private String InpUrl;
    private DataBaseManager dbman;
    
    public TextExtractor(String InpUrl,String htmlpage,DataBaseManager dbman) {
        this.htmlpage = htmlpage;
        this.dbman = dbman;
        this.InpUrl = InpUrl;
    }
    
    public void extracttext(){
        setHtmltext(getHtmlpage().replaceAll("\r\n", " "));
        setHtmltext(getHtmlpage().replaceAll("\\&gt;", ""));
        setHtmltext(getHtmlpage().replaceAll("\\&nbsp;", ""));
        setHtmltext(getHtmlpage().replaceAll("\\&bull;", ""));
        setHtmltext(getHtmlpage().replaceAll("\\&raquo;", ""));
        setHtmltext(getHtmltext().replaceAll("\\<script.*?</script>", ""));//remove all CSS styling
        setHtmltext(getHtmltext().replaceAll("\\<style .*?/style>", ""));
        setHtmltext(getHtmltext().replaceAll("\\<!--.*?-->", ""));
        setHtmltext(getHtmltext().replaceAll("\\<.*?>", ""));//remove all tags
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(getHtmltext());
        System.out.println("-----------------------------------------------------------------------------");
        //dbman.executeProcInsertPageContent(InpUrl, htmltext.trim().substring(0, 4094));
        //if(htmltext.trim().length() > 255) dbman.executeInsertQuery("INSERT INTO `webcrawler`.`url_content` values(" + InpUrl + "," + htmltext.trim().substring(0, 255) +");");
        dbman.executeInsertQuery("INSERT INTO `webcrawler`.`url_content`(url,text) value('" + InpUrl + "','" + htmltext +"');"); // TODO INSERT  real link & text 
                

    }

    public String getHtmlpage() {
        return htmlpage;
    }

    public void setHtmlpage(String htmlpage) {
        this.htmlpage = htmlpage;
    }

    public String getHtmltext() {
        return htmltext;
    }

    public void setHtmltext(String htmltext) {
        this.htmltext = htmltext;
    }

    public DataBaseManager getDbman() {
        return dbman;
    }

    public void setDbman(DataBaseManager dbman) {
        this.dbman = dbman;
    }

    
}
