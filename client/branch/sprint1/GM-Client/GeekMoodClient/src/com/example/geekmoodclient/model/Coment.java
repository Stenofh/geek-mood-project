package com.example.geekmoodclient.model;

public class Coment {

	private long id;

	private String content;

	private Post post;

	public Coment() {
	}

	public Coment(long id, String content, Post post) {
		this.id = id;
		this.content = content;
		this.post = post;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
