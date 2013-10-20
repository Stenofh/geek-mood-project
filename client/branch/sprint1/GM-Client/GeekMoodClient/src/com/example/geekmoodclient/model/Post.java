package com.example.geekmoodclient.model;

import java.util.Date;
import java.util.List;

public class Post {

	private long id;

	private int countShow;

	private int countTeleze;

	private Date postDate;

	private User user;

	private Mood mood;

	private List<Coment> coments;

	private String description;

	public Post() {
	}

	public Post(long id, int countShow, int countTeleze, User user, Mood mood) {
		this.id = id;
		this.countShow = countShow;
		this.countTeleze = countTeleze;
		this.user = user;
		this.mood = mood;
	}

	public int getCountShow() {
		return countShow;
	}

	public void setCountShow(final int countShow) {
		this.countShow = countShow;
	}

	public int getCountTeleze() {
		return countTeleze;
	}

	public void setCountTeleze(final int countTeleze) {
		this.countTeleze = countTeleze;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mood getMood() {
		return mood;
	}

	public void setMood(Mood mood) {
		this.mood = mood;
	}

	public List<Coment> getComents() {
		return coments;
	}

	public void setComents(List<Coment> coments) {
		this.coments = coments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
