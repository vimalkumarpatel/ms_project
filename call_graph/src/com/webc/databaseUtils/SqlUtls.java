package com.webc.databaseUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.webc.utils.Logger;

public class SqlUtls {
	
	private static final boolean isLoggerEnabled = true;
	
	private SqlUtls() {
	}

	
	
	public static ResultSet executeQuery(String sql) {
		Connection cn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			cn = Pool.getConnection();
			stmt = cn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			if(isLoggerEnabled)Logger.log(e);
		} finally {
			try {
				if(null!=cn){
					cn.close();
				}
			} catch (Exception e) {
				Logger.log(e);
			}
		}
		return rs;

	}
	public static void main(String[] args) throws SQLException {
		ResultSet rs = executeQuery("select * from log_vpa;");
		while(rs.next()){
			System.out.println(rs.getString(2));
		}
	}
}
