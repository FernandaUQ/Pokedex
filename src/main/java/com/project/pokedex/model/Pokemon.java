package com.project.pokedex.model;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.pokedex.model.dto.PokemonAbilityDTO;
import com.project.pokedex.model.dto.PokemonTypeDTO;
import lombok.Data;

public class Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    private Double height;
    private Double weight;

    private String front_default;

    @JsonProperty("types")
    private List<PokemonTypeDTO> type;

    @JsonProperty("abilities")
    private List<PokemonAbilityDTO> ability;

    @JsonProperty("sprites")
    public Image image;


    public static class Reduced {

        private String name;
        private String url;

        public Reduced() {}

        public Reduced(String name, String url) {
            this.name = name;
            this.url = url;
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

    @Data
    public static class Image {
        @JsonProperty("back_default")
        private String frontDefault;
//        @JsonProperty("front_shiny")
//        private String frontShiny;
//        @JsonProperty("front_female")
//        private String frontFemale;
    }



    public Pokemon() {
    }


    public Pokemon(int id, String name, Double height, Double weight, String front_default, List<PokemonTypeDTO> type,
                   List<PokemonAbilityDTO> ability) {
        super();
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.front_default = front_default;
        this.type = type;
        this.ability = ability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }


    public List<PokemonTypeDTO> getType() {
        return type;
    }

    public void setType(List<PokemonTypeDTO> type) {
        this.type = type;
    }

    public List<PokemonAbilityDTO> getAbility() {
        return ability;
    }

    public void setAbility(List<PokemonAbilityDTO> ability) {
        this.ability = ability;
    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pokemon other = (Pokemon) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", name=" + name + "]";
    }

}
