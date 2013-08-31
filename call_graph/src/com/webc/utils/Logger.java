package com.webc.utils;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {

	private static File f = null;
	static PrintWriter pw  = null;
	
	static {
		try {
			f = new File("WebCrawlerLogging.log");
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println(new Date().toString());
			pw.println("Starting Up Logging for WebCrawler at time:"+new Date(System.currentTimeMillis()));
		} catch (Exception e) {
		}
	}

	private static void writeLogTime(){
		pw.write("["+new Date().toString()+"]");		
	}
	public static void log(String msg) {
		writeLogTime();
		writeLoggingClass();
		pw.write(msg);
	}

	private static void writeLoggingClass() {
		try{
			throw new Exception();
		}catch(Exception e){
			StackTraceElement [] st = e.getStackTrace();
			pw.write("FROM CLASS: "+st[0].getClassName());
		}
	}
	public static void log(Exception e) {
		writeLogTime();
		writeLoggingClass();
		e.printStackTrace(pw);
	}

	public static void log() {

	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(f.getAbsolutePath());
		log(new IOException());
		pw.close();
		f = null;
		File ff = new File("WebCrawlerLogging.log");
		FileInputStream fis = new FileInputStream(ff);
		DataInputStream dis = new DataInputStream(fis);
		while(dis.available()>0){
			System.out.println(dis.readLine());
		}
		dis.close();
	}
	public static PrintWriter getPrintWriter() {
		// TODO Auto-generated method stub
		return pw;
	}
}
