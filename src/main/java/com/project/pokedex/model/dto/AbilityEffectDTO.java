package com.project.pokedex.model.dto;

public class AbilityEffectDTO {
		
	private String short_effect;

	public AbilityEffectDTO() {
	}

	public AbilityEffectDTO(String short_effect) {
		super();
		this.short_effect = short_effect;
	}

	public String getShort_effect() {
		return short_effect;
	}

	public void setShort_effect(String short_effect) {
		this.short_effect = short_effect;
	}

	@Override
	public String toString() {
		return "AbilityEffectDTO [short_effect=" + short_effect + "]";
	}
	
	
	
	
}
