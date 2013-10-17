package com.geekmood.server.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private long id;

    @Column(name = "show_count")
    private int countShow;

    @Column(name = "teleze_count")
    private int countTeleze;
    
    @Column(name = "post_date")
    private Date postDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "mood_id")
    private Mood mood;

    @OneToMany(mappedBy = "post")
    private List<Coment> coments;

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

}
