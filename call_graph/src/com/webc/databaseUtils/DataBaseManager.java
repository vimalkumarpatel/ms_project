/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webc.databaseUtils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;

/**
 * 
 * @author vimal
 */
public class DataBaseManager {

	//Connection conn;
//	Pool pool = null;
	String dbName, dbUser, dbPassword;
	CallableStatement callableStmt;
	ConnectionPoolDataSource connPool;

	/**
	 * <b>Usage</b> : 	constructor , loads the driver class into the memory & 
	 * 					creates a connection.
	 * 
	 * 
	 * <b>parameters</b> : dbNname, dbUser, dbPassword.
	 * dbNname = database schema name,
	 * dbUser = user in the database to login with,
	 * dbPassword = password of the user to login with.
	 */
	public DataBaseManager(String dbNname, String dbUser, String dbPassword)
			throws SQLException {
		this.dbName = dbNname;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
//		try {
//			pool = new Pool("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/"+this.dbName,this.dbUser,this.dbPassword);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("Exception Message:"+e.getMessage());
//		}
	}

	public void _connect(String dbNname, String dbUser, String dbPassword) {
		this.dbName = dbNname;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	public void storePageContent(String Url, String text) {
		Connection conn = null;
		try {
			System.out.print("CALL `webcrawler`.`ProcInsertPageContent` ("
					+ Url + "," + text + ")");
			conn = Pool.getConnection();
			callableStmt = conn
					.prepareCall("{ call ProcInsertPageContent(?, ?) }");
			callableStmt.setString(1, Url);
			callableStmt.setString(2, text);
			boolean r = callableStmt.execute();
			System.out.println(" =>> " + r);
			callableStmt.close();

		} catch (SQLException E) {
			Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE,
					null, E);
			E.printStackTrace();
			System.out.println("SQLException: " + E.getMessage());
			System.out.println("SQLState:     " + E.getSQLState());
			System.out.println("VendorError:  " + E.getErrorCode());
		} finally{
			if(conn!=null){
				try{conn.close();}catch(Exception e){}
			}			
		}
	}

	public void storeLinkPair(String urlSrc, String urlDest) {
		Connection conn = null;
		try {
			conn = Pool.getConnection();
			callableStmt = conn.prepareCall("{ call InsertLinkPair(?, ?) }");
			callableStmt.setString(1, urlSrc);
			callableStmt.setString(2, urlDest);
			boolean r = callableStmt.execute();
			System.out.println("CALL InsertLinkPair(" + urlSrc + "," + urlDest
					+ ") == " + r);
			conn.close();
			callableStmt.close();

		} catch (SQLException E) {
			Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE,
					null, E);
			E.printStackTrace();
			System.out.println("SQLException: " + E.getMessage());
			System.out.println("SQLState:     " + E.getSQLState());
			System.out.println("VendorError:  " + E.getErrorCode());
		} finally {
			if(conn!=null){
				try{conn.close();}catch(Exception e){}
			}			
		}

	}

	public void executeInsertQuery(String myQuery) {
		Connection conn = null;
		try {
//			conn = Pool.getConnection();
			PreparedStatement st = conn.prepareStatement(myQuery);
			int result = st.executeUpdate();
			System.out.println("Result of [" + myQuery + "]=" + result);

		} catch (SQLException E) {
			// E.printStackTrace();
			System.out.println("SQLException: " + E.getMessage());
			System.out.println("SQLState:     " + E.getSQLState());
			System.out.println("VendorError:  " + E.getErrorCode());
		} finally {
			if(conn!=null){
				try{conn.close();}catch(Exception e){}
			}			
		}
	}
}
