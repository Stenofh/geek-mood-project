package com.example.geekmoodclient.model;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String nickname;
    private String email;
    private String password;
    private String image;
    private int logged;

    public User() {
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getNickname() {
	return nickname;
    }

    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public int getLogged() {
	return logged;
    }

    public void setLogged(int logged) {
	this.logged = logged;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + logged;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result
		+ ((nickname == null) ? 0 : nickname.hashCode());
	result = prime * result
		+ ((password == null) ? 0 : password.hashCode());
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
	User other = (User) obj;
	if (email == null) {
	    if (other.email != null)
		return false;
	} else if (!email.equals(other.email))
	    return false;
	if (id != other.id)
	    return false;
	if (logged != other.logged)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (nickname == null) {
	    if (other.nickname != null)
		return false;
	} else if (!nickname.equals(other.nickname))
	    return false;
	if (password == null) {
	    if (other.password != null)
		return false;
	} else if (!password.equals(other.password))
	    return false;
	return true;
    }

    public String getImage() {
	return image;
    }

    public void setImage(String image) {
	this.image = image;
    }

    
}
