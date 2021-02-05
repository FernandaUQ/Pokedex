package com.project.pokedex.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.pokedex.model.dto.EggGroup;
import com.project.pokedex.model.dto.Flavor_Text_Entries;
import com.project.pokedex.model.dto.Genera;

public class Species implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	@JsonProperty("base_happiness")
	private int baseHappiness;
	@JsonProperty("egg_group")
	private List<EggGroup> eggGroup;
	private List<Flavor_Text_Entries> flavor_text_entries;
	private List<Genera> genera ;
	private int hatch_counter;
	private int capture_rate;
	
	
	public Species() {
		super();
	}

	
	public Species(int id, int baseHappiness, List<EggGroup> eggGroup,
			List<Flavor_Text_Entries> flavor_text_entries, List<Genera> genera, int hatch_counter, int capture_rate) {
		super();
		this.id = id;
		this.baseHappiness = baseHappiness;
		this.eggGroup = eggGroup;
		this.flavor_text_entries = flavor_text_entries;
		this.genera = genera;
		this.hatch_counter = hatch_counter;
		this.capture_rate = capture_rate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBaseHappiness() {
		return baseHappiness;
	}

	public void setBaseHappiness(int baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	public List<EggGroup> getEggGroup() {
		return eggGroup;
	}

	public void setEggGroup(List<EggGroup> eggGroup) {
		this.eggGroup = eggGroup;
	}
	
	

	public Flavor_Text_Entries getFlavor_text_entries() {
		return flavor_text_entries.get(0);
	}


	public void setFlavor_text_entries(List<Flavor_Text_Entries> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}


	public String getGenera() {
		return genera.get(7).getGenus();
	}


	public void setGenera(List<Genera> genera) {
		this.genera = genera;
	}


	public int getHatch_counter() {
		return hatch_counter;
	}


	public void setHatch_counter(int hatch_counter) {
		this.hatch_counter = hatch_counter;
	}


	public int getCapture_rate() {
		return capture_rate;
	}


	public void setCapture_rate(int capture_rate) {
		this.capture_rate = capture_rate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Species other = (Species) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Species [id=" + id + ", baseHappiness=" + baseHappiness + ", eggGroup=" + eggGroup
				+ ", flavor_text_entries=" + flavor_text_entries + ", genera=" + genera + ", hatch_counter="
				+ hatch_counter + ", capture_rate=" + capture_rate + "]";
	}

	
}
