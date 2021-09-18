package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Specialization;
import com.example.service.ISpecializationService;

@Controller
@RequestMapping("/spec")

public class SpecializationController {
	
	@Autowired
	private ISpecializationService service;
	
	@GetMapping("/register")
	public String displayRegister() {
		return "SpecializationRegister";
		
	}
	
	/*
	 * 
	 * 3.display all specialization
	 */
	
	@GetMapping("/all")
	
	public String viewAll(Model model) {
		List<Specialization> list=service.getAllSpecialization();
		model.addAttribute("list", list);
		return "SpecializationData";
		
	}

}
