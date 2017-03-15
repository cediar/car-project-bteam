package tech.bteam.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tech.bteam.spring.model.Car;
import tech.bteam.spring.service.CarService;

@Controller
public class CarController {

	@Autowired
	CarService carService;
	
	@GetMapping("/list")
	public String listCars(Model model){
		model.addAttribute("cars", carService.getCoches());
		
		return "listar";
	}
	
	
	@GetMapping("/add")
	public String addCarRedirect(Model model){
	Car car = new Car();
	model.addAttribute("coche", car);
	return "addCar";
	}
	
	@PostMapping("/add")
	public String addCar(@Valid @ModelAttribute("car") Car car, BindingResult result, Model model){
		
		carService.saveCar(car);
	
	return "redirect:/listar";
	
	}
	
//	GetMapping("/edit/{matricula}"){
//		
//	}
//	
	
	
}
