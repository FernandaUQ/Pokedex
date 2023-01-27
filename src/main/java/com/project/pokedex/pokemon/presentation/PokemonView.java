package com.project.pokedex.pokemon.presentation;

import com.project.pokedex.pokemon.application.query.GetPokemonByDexNumberQuery;
import com.project.pokedex.pokemon.application.query.GetPokemonByDexNumberQueryExecutor;
import com.project.pokedex.pokemon.application.query.ListPokemonPaginatedQuery;
import com.project.pokedex.pokemon.application.query.ListPokemonPaginatedQueryExecutor;
import com.project.pokedex.pokemon.core.context.PokemonListing;
import com.project.pokedex.pokemon.core.read.Pokemon;
import com.project.pokedex.pokemon.core.read.PokemonEssential;
import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonQueryRepository;
import com.project.pokedex.util.classes.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tech.rocketwave.airway.Airway;
import tech.rocketwave.airway.InProcessAirway;

import java.util.List;

@Controller
public class PokemonView {

    private final PokemonQueryRepository pokemonQueryRepository;
    Airway airway = new InProcessAirway();

    public PokemonView(PokemonQueryRepository pokemonQueryRepository) {
        this.pokemonQueryRepository = pokemonQueryRepository;
    }


    @GetMapping("pokemon")
    public ModelAndView pokemonView(
            @RequestParam(name = "pokemonId", defaultValue = "1", required = false) Integer pokemonId
    ) {
        ModelAndView modelAndView = new ModelAndView("Pokemon.html");
        modelAndView.addObject("pokemon", getPokemonByDexNumber(pokemonId));
        modelAndView.addObject("pokemons", listPokemonPaginated(null, null));
        return modelAndView;

    }


    private Pokemon getPokemonByDexNumber(Integer dexNumber) {
        airway.register(GetPokemonByDexNumberQuery.class, new GetPokemonByDexNumberQueryExecutor(pokemonQueryRepository));
        return airway.dispatch(new GetPokemonByDexNumberQuery(dexNumber));
    }

    private List<PokemonListing> listPokemonPaginated(Integer limit, Integer offset) {
        airway.register(ListPokemonPaginatedQuery.class, new ListPokemonPaginatedQueryExecutor(pokemonQueryRepository));
        var pokemonList = airway.dispatch(new ListPokemonPaginatedQuery(limit, offset));
        return pokemonList != null && pokemonList.results != null && !pokemonList.results.isEmpty() ?
                pokemonList.results :
                List.of();
    }


}
