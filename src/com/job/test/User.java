package com.job.test;

import java.util.Date;

public class User {
	String name;
	String email;
	Date date;
	
	public User(String name, String email, Date date) {
		this.name=name;
		this.email=email;
		this.date=date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String gmail) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
