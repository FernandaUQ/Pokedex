package com.project.pokedex.model.dto;

import com.project.pokedex.model.Ability;
import com.project.pokedex.model.Pokemon;

public class PokemonAbilityDTO {
	
	private Pokemon pokemon;
	private Ability ability;
	private boolean is_hidden;
	private int slot;
	
	
	
	public PokemonAbilityDTO() {
		super();
	}



	public PokemonAbilityDTO(Pokemon pokemon, Ability ability, boolean is_hidden, int slot) {
		super();
		this.pokemon = pokemon;
		this.ability = ability;
		this.is_hidden = is_hidden;
		this.slot = slot;
	}



	public Pokemon getPokemon() {
		return pokemon;
	}



	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}



	public Ability getAbility() {
		return ability;
	}



	public void setAbility(Ability ability) {
		this.ability = ability;
	}



	public boolean isIs_hidden() {
		return is_hidden;
	}



	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}



	public int getSlot() {
		return slot;
	}



	public void setSlot(int slot) {
		this.slot = slot;
	}



	@Override
	public String toString() {
		return "PokemonAbilityDTO [pokemon=" + pokemon + ", ability=" + ability + ", is_hidden=" + is_hidden + ", slot="
				+ slot + "]";
	}
	
	
	

}
