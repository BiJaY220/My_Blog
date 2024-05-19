package com.project.entities;

import java.sql.Timestamp;

public class BlogPost {
	private int bid;
    private String bTitle;
    private String bContent;
    private String bCode;
    private String bPic;
    private Timestamp bDate;
    private int cateId;
    private int userId;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbPic() {
		return bPic;
	}
	public void setbPic(String bPic) {
		this.bPic = bPic;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BlogPost(int bid, String bTitle, String bContent, String bCode, String bPic, Timestamp bDate, int cateId,
			int userId) {
		super();
		this.bid = bid;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bCode = bCode;
		this.bPic = bPic;
		this.bDate = bDate;
		this.cateId = cateId;
		this.userId = userId;
	}
	public BlogPost() {
		super();
		// TODO Auto-generated constructor stub
	}

}
