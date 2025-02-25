package com.bean;

public class Credentials {
	int login_ID;
	String name;
	String mobile;
	String address;
	String mail;
	String password;
	String role;
	
	public Credentials(int login_ID,
	String name,
	String mobile,
	String address,
	String mail,
	String password,
	String role) {
		this.login_ID=login_ID;
		this.name=name;
		this.mobile=mobile;
		this.address=address;
		this.mail=mail;
		this.password=password;
		this.role=role;
		
	}
	public int getLogin_ID() {
		return login_ID;
	}
	public void setLogin_ID(int login_ID) {
		this.login_ID = login_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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

}
