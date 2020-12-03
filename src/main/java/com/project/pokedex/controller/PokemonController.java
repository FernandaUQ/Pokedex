package com.project.pokedex.controller;

import java.util.ArrayList;
import java.util.List;

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
	private SpeciesController species;
	private Species specie;

	@GetMapping("pokemon/resp/{id}")
	public ResponseEntity<Pokemon> obterPokemon(@PathVariable int id) {

		Pokemon pokemon = this.pokemonService.PokeCall(id);

		return ResponseEntity.ok(pokemon);
	}

	public Pokemon obterPokemonPorId(@PathVariable int id) {

		Pokemon pokemon = this.pokemonService.PokeCall(id);

		return pokemon;

	}

	public List<Pokemon> obterPokemons() {
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		int i = 1;
		do {
		Pokemon pk = this.obterPokemonPorId(i);
		pokemons.add(pk);
		i++;
		}while (i<20);
		return pokemons;
	}

	@GetMapping("pokemon/{id}")
	public ModelAndView PokemonView(Pokemon pokemon) {

		ModelAndView modelAndView = new ModelAndView("Pokemon.html");
		modelAndView.addObject("pokemon", obterPokemonPorId(pokemon.getId()));
		modelAndView.addObject("pokemons", obterPokemons());
		modelAndView.addObject("Species", species.obterSpecies(specie.getId()));
		return modelAndView;

	}

}
