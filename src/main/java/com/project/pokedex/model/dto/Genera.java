package com.project.pokedex.model.dto;

public class Genera {
	private String genus;

	public Genera() {
		super();
	}

	public Genera(String genus) {
		super();
		this.genus = genus;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	@Override
	public String toString() {
		return "Genera [genus=" + genus + "]";
	}
	
	
}
