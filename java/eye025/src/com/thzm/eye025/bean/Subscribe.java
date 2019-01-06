package com.thzm.eye025.bean;

import java.sql.Date;

public class Subscribe {
	
	private String name;
	private String connect;
	private String email;
	private String gender;
	private String age;
	private String item;
	private Date date;
	private String  description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Subscribe(String name, String connect, String email, String gender, String age, String item, Date date,
			String description) {
		super();
		this.name = name;
		this.connect = connect;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.item = item;
		this.date = date;
		this.description = description;
	}
	public Subscribe() {
		super();
	}
	@Override
	public String toString() {
		return "Subscribe [name=" + name + ", connect=" + connect + ", email=" + email + ", gender=" + gender + ", age="
				+ age + ", item=" + item + ", date=" + date + ", description=" + description + "]";
	}
	
	
	

}
