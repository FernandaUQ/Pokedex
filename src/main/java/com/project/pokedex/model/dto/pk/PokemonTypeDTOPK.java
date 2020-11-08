package com.project.pokedex.model.dto.pk;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Type;

public class PokemonTypeDTOPK {
	
	public PokemonTypeDTOPK() {
		super();
	}
	public PokemonTypeDTOPK(Pokemon pokemon, Type type) {
		super();
		this.pokemon = pokemon;
		this.type = type;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pokemon == null) ? 0 : pokemon.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		PokemonTypeDTOPK other = (PokemonTypeDTOPK) obj;
		if (pokemon == null) {
			if (other.pokemon != null)
				return false;
		} else if (!pokemon.equals(other.pokemon))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
