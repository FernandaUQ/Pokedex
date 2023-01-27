package com.project.pokedex.pokemon.infrastructure.accessdata;

import com.project.pokedex.pokemon.core.context.PokemonConsumerListing;
import com.project.pokedex.pokemon.core.read.Pokemon;
import com.project.pokedex.pokemon.core.read.PokemonEssential;
import com.project.pokedex.util.classes.Page;

public interface PokemonQueryRepository {
    Pokemon getByDexNumber(Integer dexNumber);
    Page<PokemonConsumerListing> getAllPaginated(Integer limit, Integer offset);
}
