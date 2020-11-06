package com.project.pokedex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Ability;
import com.project.pokedex.service.AbilityService;

@Controller
public class AbilityController {
	
	@Autowired
	private AbilityService abilityService;
	
	@GetMapping("ability/resp/{id}")
	public ResponseEntity<Ability> obterAbility(@PathVariable String id) {
		
		Ability ability = this.abilityService.AbilityCall(id);

		return ResponseEntity.ok(ability) ;
	}
	
	public Ability obterAbilityPorId (@PathVariable String i) {
		
		Ability ability = this.abilityService.AbilityCall(i);
		
		return ability;
		
	}
	
	@GetMapping("ability/{id}")
	public ModelAndView AbilityView(Ability ability) {
		
		
		ModelAndView modelAndView = new ModelAndView("Ability.html");	
		modelAndView.addObject("ability", obterAbilityPorId(ability.getId()));
		
		return modelAndView;
		
	}
	
	
		
	}
	
	
	
	
