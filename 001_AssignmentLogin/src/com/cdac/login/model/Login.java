package com.cdac.login.model;

import java.io.Serializable;

public class Login implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6657987022709820634L;
	private String userId;
	private String userName;
	private String password;
	private String role;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String userId, String userName, String password, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}

	
}
