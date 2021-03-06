package com.project.pokedex;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class PokedexApplication {
	
	@Bean
	public WebClient webClientPokemon(WebClient.Builder builder) {
		return builder
			.baseUrl("https://pokeapi.co/api/v2")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(PokedexApplication.class, args);
	}	
		
		}
	
