package testers;



import com.webc.databaseUtils.DataBaseManager;
import com.webc.downloader.HtmlDownloader;
import com.webc.utils.QueueManager;

/*
 * Main.java
 *
 * Created on March 24, 2009, 10:52 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author fco61
 */
public class Main { 

    private static DataBaseManager database;
    private static HtmlDownloader htmlDownloader;
    private static QueueManager queueManager;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    	database = new DataBaseManager("webcrawler","root","root");            
    	queueManager = new QueueManager(database);
    	queueManager.AddUrl("http://java.sun.com/docs/books/tutorial/jdbc/basics/index.html");
    	htmlDownloader = new HtmlDownloader(queueManager,database);
//            getHd().getQm().AddUrl("http://localhost:8080/docs/introduction.html");
//            getHd().getQm().AddUrl("http://localhost:8080/j2ee_5_docs/");

        Thread t = new Thread(htmlDownloader);
//        Thread t2 = new Thread(getHd());
//        Thread t3 = new Thread(getHd());

        t.start();
//        t2.start();
//        t3.start();
        net.vimalpatel.test.A a = new net.vimalpatel.test.A();
		a.method_dummy();
		a.method_A1();
    }

//    public DataBaseManager getDb() {
//        return database;
//    }
//
//    public static void setDb(DataBaseManager aDb) {
//        database = aDb;
//    }
//
//    public static HtmlDownloader getHd() {
//        return htmlDownloader;
//    }
//
//    public static void setHd(HtmlDownloader aHd) {
//        htmlDownloader = aHd;
//    }
//
//    public QueueManager getQm() {
//        return queueManager;
//    }
//
//    public static void setQm(QueueManager aQm) {
//        queueManager = aQm;
//    }
}
