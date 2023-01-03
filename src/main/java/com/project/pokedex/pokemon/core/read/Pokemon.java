package com.project.pokedex.pokemon.core.read;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class Pokemon implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    private Double height;
    private Double weight;

    private String imgUrl;


    @JsonProperty("sprites")
    public Image image;

    @Data
    public static class Image {
        @JsonProperty("front_default")
        private String frontDefault;
//        @JsonProperty("front_shiny")
//        private String frontShiny;
//        @JsonProperty("front_female")
//        private String frontFemale;
    }



    public Pokemon() {
    }


    public Pokemon(int id, String name, Double height, Double weight, Image image) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.image = image;
        this.imgUrl = image.frontDefault;
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

    public String getImgUrl() {
        return image.frontDefault;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = image.getFrontDefault();
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
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
