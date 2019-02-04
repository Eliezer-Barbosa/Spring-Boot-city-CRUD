package com.eliezercode.CityCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eliezercode.CityCRUD.repository.CityRepository;

@Controller
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityRepository cityRepository;
	
	public CityController(CityRepository cityRepository) {
		this.cityRepository = cityRepository; 
	}
	
	@GetMapping // http://localhost:8080/cities
	public String index(Model model) {
		model.addAttribute("cities", this.cityRepository.findAll());
		return "cities/index";
	}

}
