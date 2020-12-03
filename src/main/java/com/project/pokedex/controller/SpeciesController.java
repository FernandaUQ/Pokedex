package com.project.pokedex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Species;
import com.project.pokedex.service.SpeciesService;

@Controller
public class SpeciesController {
	
	@Autowired
	private SpeciesService speciesService;
	
	@GetMapping("species/resp/{id}")
	public ResponseEntity<Species> obterSpecies(@PathVariable String id) {
		
		Species species = this.speciesService.SpeciesCall(id);

		return ResponseEntity.ok(species) ;
	}
	
	public Species obterSpeciesPorId (@PathVariable String i) {
		Species species = this.speciesService.SpeciesCall(i);
		
		return species;
		
	}
	
	@GetMapping("species/{id}")
	public ModelAndView SpeciesView(Species species) {
		
		
		ModelAndView modelAndView = new ModelAndView("Species.html");	
		modelAndView.addObject("species", obterSpeciesPorId(species.getId()));
		
		return modelAndView;
		
	}
	
	
		
	}
	
	
	
	
