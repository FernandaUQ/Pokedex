package com.project.pokedex.model;

public class Type {
	
	private int id;
	private String name;
	private String damageRelation;
	
	public Type () {
		
	};

	public Type(int id, String name, String damageRelation) {
		super();
		this.id = id;
		this.name = name;
		this.damageRelation = damageRelation;
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

	public String getDamageRelation() {
		return damageRelation;
	};

	public void setDamageRelation(String damageRelation) {
		this.damageRelation = damageRelation;
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
		Type other = (Type) obj;
		if (id != other.id)
			return false;
		return true;
	};
	
	
	

};
