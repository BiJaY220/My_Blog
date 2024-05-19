package com.project.entities;

import java.sql.Timestamp;

public class User {
	private int id;
	private String nameString;
	private String email;
	private String password;
	private String gender;
	private String details;
	private Timestamp dateTimestamp;
	private String profileString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Timestamp getDateTimestamp() {
		return dateTimestamp;
	}
	public void setDateTimestamp(Timestamp dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}
	public String getProfileString() {
		return profileString;
	}
	public void setProfileString(String profileString) {
		this.profileString = profileString;
	}
	public User(int id, String nameString, String email, String password, String gender, String details,
			Timestamp dateTimestamp, String profileString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.details = details;
		this.dateTimestamp = dateTimestamp;
		this.profileString = profileString;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String passwordString, String emailString, String genderString, String profileString2,
			String detailString) {
		this.nameString=name;
		this.password=passwordString;
		this.email=emailString;
		this.gender=genderString;
		this.details=detailString;
		this.profileString=profileString2;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nameString=" + nameString + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", details=" + details + ", dateTimestamp=" + dateTimestamp
				+ ", profileString=" + profileString + "]";
	}
	
	

}
