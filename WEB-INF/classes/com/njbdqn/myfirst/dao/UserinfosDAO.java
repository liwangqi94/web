package com.njbdqn.myfirst.dao;

import com.njbdqn.myfirst.db.*;
import com.njbdqn.myfirst.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class UserinfosDAO {
	private DbUtil util;
	public UserinfosDAO(){
		util= new DbUtil();
	}
	
	public List<Userinfos> findAll()throws Exception{
		String sql="select * from userinfos";
		return resultToArray(sql,new Object[] {});
	}
	
	private List<Userinfos> resultToArray(String sql,Object[] params)throws Exception{
		List<Userinfos> users= new ArrayList<Userinfos>();
		ResultSet rs =util.query(sql,params);
		while(rs.next()){
			Userinfos us = new Userinfos();
			us.setUserid(rs.getInt("userid"));
			us.setUsername(rs.getString("username"));
			us.setBirthday(rs.getDate("birthday"));
			users.add(us);
		}
		return users;
	}
}