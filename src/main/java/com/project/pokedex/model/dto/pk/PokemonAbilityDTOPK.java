package com.project.pokedex.model.dto.pk;

import com.project.pokedex.model.Ability;
import com.project.pokedex.model.Pokemon;

public class PokemonAbilityDTOPK {
	private Pokemon pokemon;
	private Ability ability;
	
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
	
}
