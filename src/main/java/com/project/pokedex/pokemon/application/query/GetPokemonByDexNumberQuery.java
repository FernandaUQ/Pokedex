package com.project.pokedex.pokemon.application.query;

import com.project.pokedex.pokemon.core.read.Pokemon;
import tech.rocketwave.airway.query.Query;

public class GetPokemonByDexNumberQuery implements Query<Pokemon> {

    public final Integer dexNumber;

    public GetPokemonByDexNumberQuery(Integer dexNumber) {
        this.dexNumber = dexNumber;
    }
}
