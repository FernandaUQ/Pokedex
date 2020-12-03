package com.project.pokedex.model;

import java.io.Serializable;
import java.util.List;

public class Species implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private int baseHappiness;
	private String color;
	private List<EggGroup> eggGroup;
	
	
	
	public Species() {
		super();
	}

	public Species(String id, int baseHappiness, String color, List<EggGroup> eggGroup) {
		super();
		this.id = id;
		this.baseHappiness = baseHappiness;
		this.color = color;
		this.eggGroup = eggGroup;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBaseHappiness() {
		return baseHappiness;
	}

	public void setBaseHappiness(int baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<EggGroup> getEggGroup() {
		return eggGroup;
	}

	public void setEggGroup(List<EggGroup> eggGroup) {
		this.eggGroup = eggGroup;
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
		Species other = (Species) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Species [id=" + id + ", baseHappiness=" + baseHappiness + ", color=" + color + ", eggGroup=" + eggGroup
				+ "]";
	}
	
}
