package com.project.pokedex.model.dto;

public class Flavor_Text_Entries {
	private String flavor_text;

	public Flavor_Text_Entries() {
		super();
	}

	public Flavor_Text_Entries(String flavor_text) {
		super();
		this.flavor_text = flavor_text;
	}

	public String getFlavor_text() {
		return flavor_text;
	}

	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}

	@Override
	public String toString() {
		return "Flavor_Text_Entries [flavor_text=" + flavor_text + "]";
	}
	
	

}
