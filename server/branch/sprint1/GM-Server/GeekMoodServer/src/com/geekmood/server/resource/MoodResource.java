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

import com.geekmood.server.model.Mood;

@Path("/mood")
public class MoodResource {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;

	private final Mood mood = new Mood(1, "Se sentindo o Capit�o Nascimento",
			"Aquele momento que vc est� se sentindo autorit�rio e que ningu�m pode te contestar, vc est� causando medo nas pessoas.", "path://test");
	private final Mood mood2 = new Mood(2, "Se sentindo feia com a Bruxa do 71.",
			"Aquele momento que vc est� se sentindo feia, por algum motivo vc n�o quer ver o espelho", "path://test");
	private final Mood mood3 = new Mood(3, "Se sentindo um zumbi do The Walking Dead.",
			"Aquele momento que vc est� se sentindo sem disposi��o pra nada, principalmente para trabalhar!", "path://test");
	private final Mood mood4 = new Mood(4, "Se sentido o Sheldon contando uma piada e ningu�m entendeu! Bazinga!",
			"Aquele momento que vc conta uma piada, talvez uma piada nerd, e ningupem entendeu, vc est� frstado com isso.", "path://test");
	private final Mood mood5 = new Mood(4, "Ligou o Xande Mode",
			"Aquele momento que vc se encontra fissurado no trabalho, esqueceu a hora de ir pra casa! N�o ente fome nem sede!!! � vc est� viciado em Trabalho!", "path://test");
	private final Mood mood6 = new Mood(4, "Ligou o Seu Lunga Mode",
			"Aquele momento que vc se encontra sem paci�ncia, muitos diriam que vc est� rabugento, toler�ncia zero, se uma pessoa vacilar ao conversar contigo com certeza vc vai cortar o assunto com uma frase desagrad�vel!", "path://test");

	
	private final List<Mood> moods = new ArrayList<Mood>();

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

	@GET
	@Path("allmoods")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mood> getAllMoods() {
		moods.add(mood);
		moods.add(mood2);
		moods.add(mood3);
		moods.add(mood4);
		moods.add(mood5);
		moods.add(mood6);
		return moods;
	}

}
