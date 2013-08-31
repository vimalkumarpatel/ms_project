package com.webc.databaseUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS;
import org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource;

import com.webc.utils.Logger;

//import oracle.jdbc.pool.OracleDataSource;


public class Pool
{
    private static DataSource ds;
    static{
    	FileInputStream fis;
		try {
			fis = new FileInputStream("resource/DATABASE.PROPERTY");
	    	Properties properties = new Properties();
	    	properties.load(fis);
	    	String dbType = properties.getProperty("DATABASE_TYPE");
			properties.clear();
			fis.close();
//			if ("MYSQL".equals(dbType)) {
				fis = new FileInputStream("resource/" + dbType
						+ "_DATABASE.PROPERTY");
				properties.load(fis);
				DriverAdapterCPDS cpds = new DriverAdapterCPDS();
				cpds.setMaxActive(500);
				cpds.setUrl(properties.getProperty("URL"));
				cpds.setUser(properties.getProperty("USER"));
				cpds.setPassword(properties.getProperty("PASSWORD"));
				SharedPoolDataSource tds = new SharedPoolDataSource();
				tds.setConnectionPoolDataSource(cpds);
				tds.setMaxActive(10);
				tds.setMaxWait(50);
				ds = tds;
				properties.clear();
				fis.close();
//			}else if("ORACLE".equals(dbType)){
//			      OracleDataSource ods;
//				try {
//					fis = new FileInputStream("resource/" + dbType
//							+ "_DATABASE.PROPERTY");
//					properties.load(fis);
//					ods = new OracleDataSource();					
//					ods.setURL(properties.getProperty("URL"));
//					ods.setUser(properties.getProperty("USER"));
//					ods.setPassword(properties.getProperty("PASSWORD"));
//					ods.setLogWriter(Logger.getPrintWriter());
//					ds = ods;
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }


    public static Connection getConnection() throws SQLException
    {       
			return ds.getConnection();
    }  
    

}
