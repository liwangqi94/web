package com.njbdqn.myfirst.db;

import java.sql.*;

public class DbUtil {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/exps";
	private static final String USERNAME="root";
	private static final String PASSWORD="106312";
	
	private static Connection conn;
	
	private Connection getConnection()throws Exception{
		if(conn==null){
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		return conn;
	}
	
	public int update(String sql,Object [] params)throws Exception{
		PreparedStatement pstm= getConnection().prepareStatement(sql);
		for(int i=0;i<params.length;i++){
			pstm.setObject(i+1,params[i]);
		}
		int count = pstm.executeUpdate();
		return count;
	}
	
	public ResultSet query(String sql,Object [] params)throws Exception{
		PreparedStatement pstm= getConnection().prepareStatement(sql);
		for(int i=0;i<params.length;i++){
			pstm.setObject(i+1,params[i]);
		}
		ResultSet rs = pstm.executeQuery();
		return rs;
	}
}