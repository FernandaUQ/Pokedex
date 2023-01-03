package com.project.pokedex.pokemon.core.read;

public class PokemonEssential {

    private Integer dexNumber;
    private String name;
    private String url;

    public PokemonEssential() {}

    public PokemonEssential(String name, String url) {
        this.name = name;
        this.url = url;
        this.dexNumber = getDexNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDexNumber() {
        var urlParted = this.url.split("/pokemon/", 2);
        var dexNum = urlParted.length > 1 ? urlParted[1].replace("/", "") : "0";
        return Integer.valueOf(dexNum);
    }
}
