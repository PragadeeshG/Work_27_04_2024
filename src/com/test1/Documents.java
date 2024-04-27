package com.test1;

public class Documents {
	private Integer docId;
	private String author;
	private String date;

	public Documents() {

	}

	public Documents(Integer docId, String author, String date) {
		super();
		this.docId = docId;
		this.author = author;
		this.date = date;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
