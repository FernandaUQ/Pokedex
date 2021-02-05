package com.project.pokedex.model.dto;

import java.io.Serializable;

public class EggGroup implements Serializable{
	private static final long serialVersionUID = 1L;
private String name;
	
	
	public EggGroup() {
	}

	
	public EggGroup(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "EggGroup [name=" + name + "]";
	}

	
	
}
