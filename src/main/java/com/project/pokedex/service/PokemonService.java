package com.project.pokedex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Pokemon;

import reactor.core.publisher.Mono;

@Service
public class PokemonService {
	
	@Autowired
	private WebClient webClientPokemon;
	
	public Pokemon PokeCall(String idPokemon) {

		Mono<Pokemon> monoPokemon = this.webClientPokemon
			.method(HttpMethod.GET)
			.uri("/pokemon/{id}", idPokemon)
			.retrieve()
			.bodyToMono(Pokemon.class);
	
		
		Pokemon pokemon = monoPokemon.block();

		return pokemon;
	}

}