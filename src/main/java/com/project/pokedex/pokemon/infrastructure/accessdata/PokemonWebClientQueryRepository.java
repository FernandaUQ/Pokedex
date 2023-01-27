package com.project.pokedex.pokemon.infrastructure.accessdata;

import com.project.pokedex.pokemon.core.context.PokemonConsumerListing;
import com.project.pokedex.pokemon.core.context.PokemonListing;
import com.project.pokedex.pokemon.core.read.Pokemon;
import com.project.pokedex.util.classes.Page;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

public class PokemonWebClientQueryRepository implements PokemonQueryRepository {

    private final WebClient webClient;

    public PokemonWebClientQueryRepository() {
        final int size = 16 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
                .build();
        this.webClient = WebClient.builder()
                .baseUrl("https://pokeapi.co/api/v2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .exchangeStrategies(strategies)
                .build();
    }


    @Override
    public Pokemon getByDexNumber(Integer dexNumber) {
        if (dexNumber == null || dexNumber < 0) return null;
        return this.webClient
                .method(HttpMethod.GET)
                .uri("/pokemon/{id}", dexNumber)
                .accept(MediaType.ALL)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .block();
    }

    @Override
    public Page<PokemonConsumerListing> getAllPaginated(Integer limit, Integer offset) {

        if (offset == null) offset = 0;
        if (limit == null) limit = 9999999;

        return this.webClient
                .method(HttpMethod.GET)
                .uri("/pokemon?offset={offset}&limit={limit}", offset, limit)
                .accept(MediaType.ALL)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Page<PokemonConsumerListing>>() {
                })
                .block();
    }
}
