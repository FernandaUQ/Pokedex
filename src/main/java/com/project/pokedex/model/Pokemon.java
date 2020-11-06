package com.project.pokedex.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	private String front_default;

	/*
	 * Quando o json possui objetos aninhados (um objeto dentro de outro objeto) é
	 * necessário construir um map para retirar apenas um atributo. A construção
	 * deste se refere na inclusão do map (pacote java.util), construido conforme o
	 * item json Caso seja objeto dentro de objeto os parametros será conforme o
	 * tipo do atributo desejado e o tipo object <String, Object>, quando chega no
	 * atributo, pode ser <tipo, string>
	 */

	@SuppressWarnings("unchecked")
	@JsonProperty("sprites")
	private void unpackNested(Map<String, Object> sprites) {
		Map<String, Object> others = (Map<String, Object>) sprites.get("other");
		Map<String, String> officialartwork = (Map<String, String>) others.get("official-artwork");
		this.front_default = officialartwork.get("front_default");
	}

	public Pokemon() {
	}

	public Pokemon(String id, String name, String front_default) {
		super();
		this.id = id;
		this.name = name;
		this.front_default = front_default;
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

	public String getFront_default() {
		return front_default;
	}

	public void setFront_default(String front_default) {
		this.front_default = front_default;
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
		Pokemon other = (Pokemon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + "]";
	}

}
