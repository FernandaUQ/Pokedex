package com.project.pokedex.controller;

import java.util.List;

import com.project.pokedex.util.classes.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Species;
import com.project.pokedex.service.PokemonService;

@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@Autowired
	private SpeciesController speciesController;
	
	@GetMapping("pokemon/resp/{id}")
	public ResponseEntity<Pokemon> obterPokemon(@PathVariable int id) {

		Pokemon pokemon = this.pokemonService.callPokemonById(id);

		return ResponseEntity.ok(pokemon);
	}

	public Pokemon obterPokemonPorId(@PathVariable int i) {

		Pokemon pokemon = this.pokemonService.callPokemonById(i);

		return pokemon;

	}

	public List<Pokemon.Reduced> obterPokemons() {
		Page<Pokemon.Reduced> pokemons = this.pokemonService.callPokemonListPageable(0, 99999);
		return pokemons.results;
	}
	
	
	

	@GetMapping("pokemon/{id}")
	public ModelAndView pokemonView(Pokemon pokemon, Species species) {
		
		ModelAndView modelAndView = new ModelAndView("Pokemon.html");
		modelAndView.addObject("pokemon", obterPokemonPorId(pokemon.getId()));
		modelAndView.addObject("pokemons", obterPokemons());
		modelAndView.addObject("species", speciesController.obterSpeciesPorId(species.getId()));
				return modelAndView;

	}

}
