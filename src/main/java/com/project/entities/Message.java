package com.project.entities;

public class Message {
	private String contentString;
	private String typeString;
	private String cssString;
	public String getContentString() {
		return contentString;
	}
	public void setContentString(String contentString) {
		this.contentString = contentString;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	public String getCssString() {
		return cssString;
	}
	public void setCssString(String cssString) {
		this.cssString = cssString;
	}
	public Message(String contentString, String typeString, String cssString) {
		super();
		this.contentString = contentString;
		this.typeString = typeString;
		this.cssString = cssString;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
