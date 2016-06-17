package com.study.spring.domain;

import java.sql.Timestamp;

public class MemberVO {
	private String user_id;
	private String pw;
	public String user_name;
	private String email;
	Timestamp regdate;
	long lastupdate;
	
	
	public long getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(long lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
}
