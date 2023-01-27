package com.project.pokedex.pokemon.application.query;

import com.project.pokedex.pokemon.core.context.Pokemon;
import com.project.pokedex.pokemon.core.context.PokemonConsumerListing;
import com.project.pokedex.pokemon.core.context.PokemonListing;
import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonQueryRepository;
import com.project.pokedex.util.classes.Page;
import tech.rocketwave.airway.query.QueryHandler;

import java.util.List;
import java.util.stream.Collectors;

public class ListPokemonPaginatedQueryExecutor implements QueryHandler<ListPokemonPaginatedQuery, Page<PokemonListing>> {

    private final PokemonQueryRepository pokemonQueryRepository;

    public ListPokemonPaginatedQueryExecutor(PokemonQueryRepository pokemonQueryRepository) {
        this.pokemonQueryRepository = pokemonQueryRepository;
    }

    @Override
    public Page<PokemonListing> handle(ListPokemonPaginatedQuery query) {
        var pokemonList = pokemonQueryRepository.getAllPaginated(query.limit, query.offset);
        return convertingPage(pokemonList);
    }

    private Page<PokemonListing> convertingPage(Page<PokemonConsumerListing> pokemonList) {
        return new Page<PokemonListing>(pokemonList.count, pokemonList.next, pokemonList.previous, toPokemonListing(pokemonList.results));
    }

    private List<PokemonListing> toPokemonListing(List<PokemonConsumerListing> pokemonList) {
        return pokemonList
                .stream()
                .map(pokemon -> {

                    var pokemonNumber = getDexNumberByUrl(pokemon.url);
                    return Pokemon.Listing(pokemonNumber, pokemon.name, generateSpriteDefaultLink(pokemonNumber));
                })
                .collect(Collectors.toList());
    }

    private Integer getDexNumberByUrl(String link) {
        if (link == null) return null;
        var dividedLink = link.split("/pokemon/", 2);
        if (dividedLink.length < 1) return null;
        var dexNum = dividedLink[1].replace("/", "");
        return Integer.valueOf(dexNum);
    }

    private String generateSpriteDefaultLink(Integer id) {
        if (id == null) return null;
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+ id.toString() +".png";
    }
}
