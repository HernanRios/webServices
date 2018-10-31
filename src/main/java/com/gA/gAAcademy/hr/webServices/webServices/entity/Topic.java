package com.gA.gAAcademy.hr.webServices.webServices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
	

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "datePost")
	private Date datePost = new Date(); 
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "author")
	private int author;
	
	@Column(name = "deleted")
	private boolean deleted = false;
	
	public Topic () {}

	public Topic(String title, String description, int author) {
		super();
		this.title = title;
		this.datePost = new Date();
		this.description = description;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = new Date();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public void delete() {
		this.deleted = true;	
	}
	
	
	
	
}
