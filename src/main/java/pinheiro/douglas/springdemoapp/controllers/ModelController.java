package pinheiro.douglas.springdemoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pinheiro.douglas.springdemoapp.repositories.ModelRepository;

@Controller
public class ModelController {

	private ModelRepository modelRepository;
	
	public ModelController(ModelRepository modelRepository) {
		this.modelRepository = modelRepository;
	}

	@RequestMapping("/models")
	public String getModels(Model model) {
		model.addAttribute("models", modelRepository.findAll());
		return "models";
	}
	
}
