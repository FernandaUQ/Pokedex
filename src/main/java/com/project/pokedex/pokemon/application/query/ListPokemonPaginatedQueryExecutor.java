package com.project.pokedex.pokemon.application.query;

import com.project.pokedex.pokemon.core.read.Pokemon;
import com.project.pokedex.pokemon.core.read.PokemonEssential;
import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonQueryRepository;
import com.project.pokedex.util.classes.Page;
import tech.rocketwave.airway.query.QueryHandler;

public class ListPokemonPaginatedQueryExecutor implements QueryHandler<ListPokemonPaginatedQuery, Page<PokemonEssential>> {

    private final PokemonQueryRepository pokemonQueryRepository;

    public ListPokemonPaginatedQueryExecutor(PokemonQueryRepository pokemonQueryRepository) {
        this.pokemonQueryRepository = pokemonQueryRepository;
    }

    @Override
    public Page<PokemonEssential> handle(ListPokemonPaginatedQuery query) {
        return pokemonQueryRepository.getAllPaginated(query.limit, query.offset);
    }
}
