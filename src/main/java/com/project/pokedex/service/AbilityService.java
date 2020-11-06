package com.project.pokedex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Ability;

import reactor.core.publisher.Mono;

@Service
public class AbilityService {
	
	@Autowired
	private WebClient webClientAbility;
	
	public Ability AbilityCall(String id) {

		Mono<Ability> monoAbility = this.webClientAbility
			.method(HttpMethod.GET)
			.uri("/ability/{id}", id)
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
			.bodyToMono(Ability.class);
	
		
		Ability ability = monoAbility.block();

		return ability;
	}

}