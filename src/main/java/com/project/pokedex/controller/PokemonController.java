package com.project.pokedex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.service.PokemonService;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	
	public ResponseEntity<Pokemon> obterPokemon(@PathVariable String id) {
		
		Pokemon pokemon = this.pokemonService.PokeCall(id);

		return ResponseEntity.ok(pokemon) ;
	}
	
	public Pokemon obterPokemonPorId (@PathVariable String id) {
		
		Pokemon pokemon = this.pokemonService.PokeCall(id);
		
		return pokemon;
		
	}
	
	@GetMapping("pokemon/{id}")
	public ModelAndView PokemonView(Pokemon pokemon) {
		
		
		ModelAndView modelAndView = new ModelAndView("Pokemon.html");	
		modelAndView.addObject("pokemon", obterPokemonPorId(pokemon.getId()));
		
		return modelAndView;
		
	}
	
	
		
	}
	
	
	
	
