package com.project.pokedex.pokemon.application.query;

import com.project.pokedex.pokemon.core.read.Pokemon;
import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonQueryRepository;
import tech.rocketwave.airway.query.QueryHandler;

public class GetPokemonByDexNumberQueryExecutor implements QueryHandler<GetPokemonByDexNumberQuery, Pokemon> {

    private final PokemonQueryRepository pokemonQueryRepository;

    public GetPokemonByDexNumberQueryExecutor(PokemonQueryRepository pokemonQueryRepository) {
        this.pokemonQueryRepository = pokemonQueryRepository;
    }

    @Override
    public Pokemon handle(GetPokemonByDexNumberQuery query) {
        return pokemonQueryRepository.getByDexNumber(query.dexNumber);
    }
}
