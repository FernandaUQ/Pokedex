package com.project.pokedex.pokemon.infrastructure.configuration;

import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonQueryRepository;
import com.project.pokedex.pokemon.infrastructure.accessdata.PokemonWebClientQueryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class QueryConfigurations {

    @Bean
    public PokemonQueryRepository pokemonQueryRepositoryConfiguration() {
        return new PokemonWebClientQueryRepository();
    }

}
