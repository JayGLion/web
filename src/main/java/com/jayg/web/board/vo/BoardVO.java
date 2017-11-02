package com.jayg.web.board.vo;

import java.io.Serializable;

import lombok.Data;

public class BoardVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8733031163706853204L;
	int seq = 0;
	int id = 0;
	String title = "";
	String author = "";	
	String content = "";
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
