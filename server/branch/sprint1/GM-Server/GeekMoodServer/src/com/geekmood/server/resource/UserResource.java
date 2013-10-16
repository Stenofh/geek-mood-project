package com.geekmood.server.resource;

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

	private final User user = new User(1, "Leo", "leo_test@test.com",
			"Stenofh", "path://test", "password");

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
}
