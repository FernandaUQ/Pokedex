package com.project.pokedex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.pokedex.model.Type;

import reactor.core.publisher.Mono;

@Service
public class TypeService {
	
	@Autowired
	private WebClient webClientType;
	
	public Type TypeCall(String id) {

		Mono<Type> monoType = webClientType
			.method(HttpMethod.GET)
			.uri("/type/{id}", id)
			.retrieve()
			.bodyToMono(Type.class);
	
		
		Type type = monoType.block();

		return type;
	}

}