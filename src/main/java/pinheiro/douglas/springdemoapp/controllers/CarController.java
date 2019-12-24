package pinheiro.douglas.springdemoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pinheiro.douglas.springdemoapp.repositories.CarRepository;

@Controller
public class CarController {

	private CarRepository carRepository;
	
	public CarController(CarRepository carRepository) {
		this.carRepository = carRepository;
	}


	@RequestMapping("/cars")
	public String getCars(Model model) {
		model.addAttribute("cars", carRepository.findAll());
		return "cars";
	}
	
}
