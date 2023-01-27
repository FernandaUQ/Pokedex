package com.project.pokedex.pokemon.core.context;

public class Pokemon {

//    private final Integer number;
//    private final String name;
//    private final String spriteUrl;
//
//    protected Pokemon(Integer number, String name, String spriteUrl) {
//        this.number = number;
//        this.name = name;
//        this.spriteUrl = spriteUrl;
//    }

    public static PokemonListing Listing(Integer number, String name, String spriteUrl) {
        return new PokemonListing(number, name, spriteUrl);
    }
}
