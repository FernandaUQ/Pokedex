package com.project.pokedex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Species;

import reactor.core.publisher.Mono;

@Service
public class SpeciesService {
	
	@Autowired
	private WebClient webClientSpecies;
	
	public Species SpeciesCall(Integer i) {

		Mono<Species> monoSpecies = webClientSpecies
			.method(HttpMethod.GET)
			.uri("/pokemon-species/{id}", i)
			.retrieve()
			.bodyToMono(Species.class);
	
		
		Species species = monoSpecies.block();

		return species;
	}


}