package com.geekmood.server.model;

public class Post {

	private int user_id;
	private int mood_id;
	private int countShow;
	private int countTeleze;

	public Post() {
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(final int user_id) {
		this.user_id = user_id;
	}

	public int getMood_id() {
		return mood_id;
	}

	public void setMood_id(final int mood_id) {
		this.mood_id = mood_id;
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

}
