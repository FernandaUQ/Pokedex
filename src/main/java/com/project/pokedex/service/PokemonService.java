package com.project.pokedex.service;

import com.project.pokedex.util.classes.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Pokemon;

import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PokemonService {

	@Autowired
	private WebClient webClientPokemon;
	

	public Pokemon callPokemonById(int i) {

		Mono<Pokemon> monoPokemon = this.webClientPokemon
				.method(HttpMethod.GET)
				.uri("/pokemon/{id}", i)
				.accept(MediaType.ALL)
				.retrieve()
				.bodyToMono(Pokemon.class);

		Pokemon pokemon = monoPokemon.block();

		return pokemon;
	}

	public Page<Pokemon.Reduced> callPokemonListPageable(Integer offset, Integer limit) {
		if (offset == null) offset = 0;
		if (limit == null) limit = 9999999;

		Mono<Page<Pokemon.Reduced>> monoPokemons = this.webClientPokemon
				.method(HttpMethod.GET)
				.uri("/pokemon?offset={offset}&limit={limit}", offset, limit)
				.accept(MediaType.ALL)
				.retrieve()
				.bodyToMono(new ParameterizedTypeReference<Page<Pokemon.Reduced>>() {});

		Page<Pokemon.Reduced> pokemons = monoPokemons.block();

		return pokemons;
	}

}