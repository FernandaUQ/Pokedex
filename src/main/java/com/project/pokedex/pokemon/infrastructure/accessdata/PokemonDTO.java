package com.project.pokedex.pokemon.infrastructure.accessdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.pokedex.util.classes.HateoasObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class PokemonDTO extends HateoasObject {
    private String name;

}
