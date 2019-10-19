package edu.mum.cs.cs425.athlete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/eAthlete", "/eAthlete/home"})
    public String home() {
        return "home/index";
    }

}
