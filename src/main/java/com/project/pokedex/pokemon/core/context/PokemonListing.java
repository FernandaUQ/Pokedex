package com.project.pokedex.pokemon.core.context;

public class PokemonListing {
    public final Integer number;
    public final String name;
    public final String spriteUrl;

    protected PokemonListing(Integer number, String name, String spriteUrl) {
        this.number = number;
        this.name = name;
        this.spriteUrl = spriteUrl;
    }
}
