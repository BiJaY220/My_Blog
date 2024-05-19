package com.project.entities;

public class Categories {
	private int cateid;
	private String name;
	private String decString;
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecString() {
		return decString;
	}
	public void setDecString(String decString) {
		this.decString = decString;
	}
	public Categories(int cateid, String name, String decString) {
		super();
		this.cateid = cateid;
		this.name = name;
		this.decString = decString;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
