package net.vimalpatel.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Logger{
	private static BufferedWriter bw = null;
	static{
		try{
			bw = new BufferedWriter(new FileWriter(new File("new.txt")));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void log(String msg){
		try{
			System.out.println(msg);
			bw.write(msg);
	        bw.newLine();
	        bw.flush();
		}catch(Exception ex){
			ex.printStackTrace();
		}		
	}
	public static void close() {
		try{
			bw.flush();
			bw.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}