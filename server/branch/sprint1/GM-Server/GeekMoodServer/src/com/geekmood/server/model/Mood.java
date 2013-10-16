package com.geekmood.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="mood")
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mood_id")
    private long id;
    
    @Column(name="name")
    private String name;
  
    @Column(name="description")
    private String description;
    
    @Column(name="image_path")
    private String imagePath;

    public Mood(long id, String name, String description, String imagePath) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
    }
    
    public Mood() {
    }

    public long getId() {
	return id;
    }

    public void setId(final long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(final String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(final String description) {
	this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

   

}
