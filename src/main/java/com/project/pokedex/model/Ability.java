package com.project.pokedex.model;

public class Ability {
	private int id;
	private String name;
	private String effectEntrie;
	
	public Ability () {
	};

	public Ability(int id, String name, String effectEntrie) {
		super();
		this.id = id;
		this.name = name;
		this.effectEntrie = effectEntrie;
	};
	public int getId() {
		return id;
	};

	public void setId(int id) {
		this.id = id;
	};

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	};

	public String getEffectEntrie() {
		return effectEntrie;
	}

	public void setEffectEntrie(String effectEntrie) {
		this.effectEntrie = effectEntrie;
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	};

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ability other = (Ability) obj;
		if (id != other.id)
			return false;
		return true;
	};

};
