package com.webc.databaseUtils;

import java.sql.Connection;
import java.sql.Statement;

public class PoolingTestClass implements Runnable {

	private int value;
//	static Pool pool = null; 	
	public PoolingTestClass(int v){
		this.value = v;
	}


	public void run() {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = Pool.getConnection();
			Statement stmt = conn.createStatement();
			
			stmt.execute("insert into poolingtest(value) values("+this.value+")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error in ["+this.value+"]:"+e.getMessage());
		} finally {
			if(conn != null){
				try{conn.close();} catch(Exception e){}
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin time	=" + System.currentTimeMillis());
//		try {
//			pool = new Pool("com.mysql.jdbc.Driver",
//					"jdbc:mysql://localhost:3306/test", "root", "root");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		for (int i = 1; i < 10; i++) {
			Thread t = new Thread(new PoolingTestClass(i));
			t.start();
//			Thread.sleep(i%2);
		}
		System.out.println("End time	=" + System.currentTimeMillis());
	}

}
