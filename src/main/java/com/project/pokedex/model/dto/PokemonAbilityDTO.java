package com.project.pokedex.model.dto;

import java.beans.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.pokedex.model.Ability;
import com.project.pokedex.model.Pokemon;
import com.project.pokedex.model.dto.pk.PokemonAbilityDTOPK;

public class PokemonAbilityDTO {
	
	private PokemonAbilityDTOPK idPA = new PokemonAbilityDTOPK();
	private boolean is_hidden;
	private int slot;
	
	
	
	public PokemonAbilityDTO() {
		super();
	}

	public PokemonAbilityDTO(Pokemon pokemon, Ability ability, boolean is_hidden, int slot) {
		super();
		idPA.setAbility(ability);
		idPA.setPokemon(pokemon);
		this.is_hidden = is_hidden;
		this.slot = slot;
	}


	@Transient
	public Pokemon getPokemon() {
		return idPA.getPokemon();
	}

	public void setPokemon(Pokemon pokemon) {
		idPA.setPokemon(pokemon);
	}

	public Ability getAbility() {
		return idPA.getAbility();
	}

	public void setAbility(Ability ability) {
		idPA.setAbility(ability);
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

}
