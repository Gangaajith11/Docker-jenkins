package org.dxc.display.entity;

public class User {
	private String username;
	private String email;
	private String mobileNo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public User(String username, String email, String mobileNo) {
		super();
		this.username = username;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	

}
