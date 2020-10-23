package com.project.pokedex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.service.PokemonService;

import reactor.core.publisher.Mono;

@RestController
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("pokemon/{id}")
	public ResponseEntity<Pokemon> obterPokemon(@PathVariable String id) {
		
		Pokemon pokemon = this.pokemonService.PokeCall(id);

		return ResponseEntity.ok(pokemon);
	}
	
	}