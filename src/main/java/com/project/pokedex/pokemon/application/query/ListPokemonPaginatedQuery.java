package com.project.pokedex.pokemon.application.query;

import com.project.pokedex.pokemon.core.context.PokemonListing;
import com.project.pokedex.pokemon.core.read.PokemonEssential;
import com.project.pokedex.util.classes.Page;
import tech.rocketwave.airway.query.Query;

public class ListPokemonPaginatedQuery implements Query<Page<PokemonListing>> {

    public final Integer limit;
    public final Integer offset;

    public ListPokemonPaginatedQuery(Integer limit, Integer offset) {
        this.limit = limit;
        this.offset = offset;
    }
}
