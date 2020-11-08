package com.project.pokedex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.project.pokedex.model.Type;
import com.project.pokedex.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@GetMapping("type/resp/{id}")
	public ResponseEntity<Type> obterType(@PathVariable String id) {
		
		Type type = this.typeService.TypeCall(id);

		return ResponseEntity.ok(type) ;
	}
	
	public Type obterTypePorId (@PathVariable String i) {
		
		Type type = this.typeService.TypeCall(i);
		
		return type;
		
	}
	
	@GetMapping("type/{id}")
	public ModelAndView TypeView(Type type) {
		
		
		ModelAndView modelAndView = new ModelAndView("Type.html");	
		modelAndView.addObject("type", obterTypePorId(type.getId()));
		
		return modelAndView;
		
	}
	
	
		
	}
	
	
	
	
