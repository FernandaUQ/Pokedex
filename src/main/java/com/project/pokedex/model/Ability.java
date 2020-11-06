package com.project.pokedex.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Ability implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	private String effectEntrie;
	
	public void deserialization(Map<String, List<Object>> effect_entries)
			throws JsonProcessingException, IOException, JSONException {
		Map<String, Object> effect_obj = (Map<String, Object>) effect_entries.get(1);
		this.effectEntrie = (String) effect_obj.get("short_effect");

	}

	public Ability() {
	};

	public Ability(String id, String name, String effectEntrie) {
		this.id = id;
		this.name = name;
		this.effectEntrie = effectEntrie;
	};

	@JsonGetter
	public String getId() {
		return id;
	}

	@JsonSetter
	public void setId(String id) {
		this.id = id;
	}

	@JsonGetter
	public String getName() {
		return name;
	}

	@JsonSetter
	public void setName(String name) {
		this.name = name;
	}

	@JsonGetter
	public String getEffectEntrie() {
		return effectEntrie;
	}

	@JsonSetter
	public void setEffectEntrie(String effectEntrie) {
		this.effectEntrie = effectEntrie;
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
		Ability other = (Ability) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	};

};
