package com.project.pokedex.model;

import java.io.Serializable;
import java.util.List;

import com.project.pokedex.model.dto.AbilityEffectDTO;


public class Ability implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	private List<AbilityEffectDTO> effect_entries;

	private String effect;
	
	private List<Pokemon> pokemon;
	
	
	public void getEffect () {
				this.effect = effect_entries.get(1).getShort_effect();
		}
	
	public Ability() {
		super();
	}

	
	public Ability(String id, String name, List<AbilityEffectDTO> effect_entries, String effect,
			List<Pokemon> pokemon) {
		super();
		this.id = id;
		this.name = name;
		this.effect_entries = effect_entries;
		this.effect = effect;
		this.pokemon = pokemon;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AbilityEffectDTO> getEffect_entries() {
		return effect_entries;
	}

	public void setEffect_entries(List<AbilityEffectDTO> effect_entries) {
		this.effect_entries = effect_entries;
	}
	

	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	public List<Pokemon> getPokemon() {
		return pokemon;
	}

	public void setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Ability other = (Ability) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ability [id=" + id + ", name=" + name + ", effect_entries=" + effect_entries + "]";
	}

}
