package com.zoo.pojo;

import java.util.List;

public class User {
	
	private String userId;
	private String userName;
	private String email;
	private String password;

	private List<String> roleList;
	
	public User(){}
	
	public User(String userName){
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", email="
				+ email + ", password=" + password + "]";
	}
}
