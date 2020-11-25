package com.project.pokedex.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Type implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private String id;
	private String name;
	private List<Pokemon> pokemon;

	public Type() {

	};

	public Type(String id, String name, List<Pokemon> pokemon) {
		super();
		this.id = id;
		this.name = name;
		this.pokemon = pokemon;
	}

	public String getId() {
		return id;
	};

	public void setId(String id) {
		this.id = id;
	};

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	};
	
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
		Type other = (Type) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + "]";
	};

};
