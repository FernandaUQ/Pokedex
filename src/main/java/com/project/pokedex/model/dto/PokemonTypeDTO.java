package com.project.pokedex.model.dto;

import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.Type;

public class PokemonTypeDTO {

	private Pokemon pokemon;
	private Type type;
	private int slot;

	public PokemonTypeDTO() {
		super();
	}

	public PokemonTypeDTO(Pokemon pokemon, int slot) {
		super();
		this.pokemon = pokemon;
		this.slot = slot;
	}
	
	public PokemonTypeDTO(Type type, int slot) {
		super();
		this.type = type;
		this.slot = slot;
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

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "PokemonTypeDTO [pokemon=" + pokemon + ", type=" + type + ", slot=" + slot + "]";
	}
	
	
	
}
