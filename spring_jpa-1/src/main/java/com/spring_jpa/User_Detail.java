package com.spring_jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




//
//Name                                      Null?    Type
//----------------------------------------- -------- ----------------------------
//U_ID                                               NUMBER(10)
//U_PASS                                             VARCHAR2(10)
//U_NAME                                             VARCHAR2(10)

@Entity
@Table(name="user_details")
public class User_Detail {
	@Id
	@Column(name="U_ID")
	private int userId;
	public int getUser_id() {
		return getUser_id();
	}
	public String getPassWord() {
		return password;
	}
	public String getUser_name() {
		return userName;
	}
	public void setUser_id(int user_id) {
		this.userId = user_id;
	}
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	public void setUser_name(String user_name) {
		this.userName = user_name;
	}
	@Column(name="U_PASS")
	private String password;
	@Column(name="U_NAME")
	private String userName;
	@Override
	public String toString() {
		return "User_Detail [userId=" + userId + ", password=" + password + ", userName=" + userName + "]";
	}
	
	
}
