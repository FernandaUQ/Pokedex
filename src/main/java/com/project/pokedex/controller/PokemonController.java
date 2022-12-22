package com.project.pokedex.controller;

import java.util.List;

import com.project.pokedex.util.classes.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Species;
import com.project.pokedex.service.PokemonService;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;
    private final SpeciesController speciesController;

    public PokemonController(SpeciesController speciesController, PokemonService pokemonService) {
        this.speciesController = speciesController;
        this.pokemonService = pokemonService;
    }

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


    @GetMapping("pokemon")
    public ModelAndView pokemonView(
            @RequestParam(name = "pokemonId", required = false) Integer pokemonId,
            Species species
    ) {
        ModelAndView modelAndView = new ModelAndView("Pokemon.html");
        modelAndView.addObject("pokemon", obterPokemonPorId(pokemonId != null && pokemonId > 0 ? pokemonId : 1));
        modelAndView.addObject("pokemons", obterPokemons());
//        modelAndView.addObject("species", speciesController.obterSpeciesPorId(species.getId()));
        return modelAndView;

    }

}
