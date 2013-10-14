package com.example.geekmoodclient.model;

import java.io.Serializable;
import java.util.Date;

public class Mood implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private String content;
    private Date postDate;
    
    public Mood(){
	
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((content == null) ? 0 : content.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result
		+ ((postDate == null) ? 0 : postDate.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Mood other = (Mood) obj;
	if (content == null) {
	    if (other.content != null)
		return false;
	} else if (!content.equals(other.content))
	    return false;
	if (id != other.id)
	    return false;
	if (postDate == null) {
	    if (other.postDate != null)
		return false;
	} else if (!postDate.equals(other.postDate))
	    return false;
	return true;
    }
    
    

}
