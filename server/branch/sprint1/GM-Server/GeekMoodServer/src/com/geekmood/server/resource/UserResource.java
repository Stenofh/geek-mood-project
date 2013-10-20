package com.geekmood.server.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.geekmood.server.model.User;

@Path("/user")
public class UserResource {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private final List<User> users = new ArrayList<User>();

	private final User user = new User(1, "Leo", "leo_test@test.com",
			"Stenofh", "path://test", "password");
	private final User user1 = new User(2, "Amanda", "amanda_test@test.com",
			"Mandica", "path://test", "password");
	private final User user2 = new User(3, "Gianfranco", "gian_test@test.com",
			"Gaspar", "path://test", "password");
	private final User user3 = new User(4, "Diego", "diego_test@test.com",
			"Nobu", "path://test", "password");
	private final User user4 = new User(5, "Haydee", "haydee_test@test.com",
			"A&D", "path://test", "password");

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String respondAsReady() {
		return UserResource.class + " is ready";
	}

	@GET
	@Path("sample")
	@Produces(MediaType.APPLICATION_JSON)
	public User getSampleUser() {

		System.out.println("Usuario sample: " + user.toString());
		return user;

	}
	
	@GET
	@Path("allusers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		return users;
	}
}
