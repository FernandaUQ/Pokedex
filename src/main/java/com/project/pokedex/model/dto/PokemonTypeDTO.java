package com.project.pokedex.model.dto;

import java.beans.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Type;
import com.project.pokedex.model.dto.pk.PokemonTypeDTOPK;

public class PokemonTypeDTO {
	
	private PokemonTypeDTOPK idPT = new PokemonTypeDTOPK();
	private int slot;

	public PokemonTypeDTO() {
		super();
	}

	public PokemonTypeDTO(Pokemon pokemon, Type type,  int slot) {
		super();
		idPT.setPokemon(pokemon);
		idPT.setType(type);
		this.slot = slot;
	}
	
	public Pokemon getPokemon() {
		return idPT.getPokemon();
	}
	@Transient
	public void setPokemon(Pokemon pokemon) {
		idPT.setPokemon(pokemon);
	}

	public String getType() {
		return idPT.getType().getName();
	}

	public void setType(Type type) {
		idPT.setType(type);
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}
	
}
