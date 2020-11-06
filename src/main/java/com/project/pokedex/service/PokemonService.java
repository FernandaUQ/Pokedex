package com.project.pokedex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ClientCodecConfigurer;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.pokedex.model.Pokemon;

import reactor.core.publisher.Mono;

@Service
public class PokemonService {
	
	@Autowired
	private WebClient webClientPokemon;
	
	public Pokemon PokeCall(String idPokemon) {

		Mono<Pokemon> monoPokemon = this.webClientPokemon
			.method(HttpMethod.GET)
			.uri("/pokemon/{id}", idPokemon).accept(MediaType.ALL)
			.retrieve()
			.bodyToMono(Pokemon.class);
	
		
		Pokemon pokemon = monoPokemon.block();

		return pokemon;
	}
	
	
}