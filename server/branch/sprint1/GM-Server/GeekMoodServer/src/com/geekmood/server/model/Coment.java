package com.geekmood.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coment")
public class Coment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coment_id")
    private long id;
    
    @Column(name="content")
    private String content;
    
    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    public Coment() {
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
