package com.project.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Pokemon;

@SpringBootApplication
public class PokedexApplication {
	
	@Bean
	public WebClient webClientPokemon(WebClient.Builder builder) {
		return builder
			.baseUrl("https://pokeapi.co/api/v2")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
		
			Pokemon pokemon = new Pokemon("1");
			
			System.out.println(pokemon.toString());
		}
	
}