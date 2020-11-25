package com.project.pokedex.model.dto.pk;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Type;

public class PokemonTypeDTOPK {
	
	private Pokemon pokemon;
	private Type type;
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
