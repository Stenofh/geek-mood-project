package com.geekmood.server.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.geekmood.server.model.Coment;
import com.geekmood.server.model.Mood;
import com.geekmood.server.model.Post;
import com.geekmood.server.model.User;

@Path("/coment")
public class ComentResource {
	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private final Coment coment = new Coment(1, "que massa esse seu mood!", new Post(1, 25, 50, new User(), new Mood()));

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String respondAsReady() {
		return ComentResource.class + " is ready";
	}
	
	@GET
	@Path("sample")
	@Produces(MediaType.APPLICATION_JSON)
	public Coment getSampleMood() {

		System.out.println("Mood sample: " + coment.toString());
		return coment;

	}

}
