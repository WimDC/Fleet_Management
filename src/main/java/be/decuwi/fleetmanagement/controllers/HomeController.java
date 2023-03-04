package be.decuwi.fleetmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final int mySpecialNumber = 729;

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("mySpecialNumber",mySpecialNumber);
        return "home";
    }
    @GetMapping("/person")
    public String person() {
        return "person";
    }
}
