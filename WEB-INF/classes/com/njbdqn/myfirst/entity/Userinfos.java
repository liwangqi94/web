package com.njbdqn.myfirst.entity;

import java.util.Date;

public class Userinfos{
	private int userid;
	private String username;
	private Date birthday;
	
	public int getUserid(){
		return this.userid;
	}
	public void setUserid(int userid){
		this.userid=userid;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
}