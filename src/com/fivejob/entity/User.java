package com.fivejob.entity;

public class User {

	private int id;
	private String account;
	private String password;
	private int identity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	
	public boolean equals(User user) {
		if (user.account.equals(this.account)&&
			user.password.equals(this.password)&&
			user.identity==this.identity
			) {
			return true;
		}
		return false;
	}
}
