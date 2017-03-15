package tech.bteam.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.bteam.spring.repository.CarRepository;
import tech.bteam.spring.service.CarService;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    

    @Autowired
    CarService carService;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    
    @GetMapping(value = "/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping(value = "/listar")
    public String findAllCoche(Model model) {
        model.addAttribute("Coche", carService.getCoche());
        return "listar";
    }

}
