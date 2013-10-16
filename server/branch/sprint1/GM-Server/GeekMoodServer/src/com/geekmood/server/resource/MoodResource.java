package com.geekmood.server.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.geekmood.server.model.Mood;

@Path("/mood")
public class MoodResource {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private final Mood mood = new Mood(1, "Chuck Norris", "Mordido por uma naja", "path://test");

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String respondAsReady() {
		return MoodResource.class + " is ready";
	}
	
	@GET
	@Path("sample")
	@Produces(MediaType.APPLICATION_JSON)
	public Mood getSampleMood() {

		System.out.println("Mood sample: " + mood.toString());
		return mood;

	}

}
