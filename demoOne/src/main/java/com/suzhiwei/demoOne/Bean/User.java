package com.suzhiwei.demoOne.Bean;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String password;
	private String phone;
	private String email;
	private Date creationTime;
	private int age;
	private String sexual;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreation_time() {
		return creationTime;
	}
	public void setCreation_time(Date creation_time) {
		this.creationTime = creation_time;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSexual() {
		return sexual;
	}
	public void setSexual(String sexual) {
		this.sexual = sexual;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", email=" + email
				+ ", creation_time=" + creationTime + ", age=" + age + ", sexual=" + sexual + "]";
	}
	
}
