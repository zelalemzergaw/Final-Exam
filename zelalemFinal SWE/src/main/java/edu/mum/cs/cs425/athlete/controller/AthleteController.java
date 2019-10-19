package edu.mum.cs.cs425.athlete.controller;

import edu.mum.cs.cs425.athlete.model.Athlete;
import edu.mum.cs.cs425.athlete.service.AthleteImpl.AthleteImplamention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AthleteController {

    @Autowired
    private AthleteImplamention athleteImplamention;

    @GetMapping(value = "eAthlete/athlete/list")
    public ModelAndView displayAthleteList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("athletes", athleteImplamention.getAllAthletes());
        modelAndView.setViewName("athlete/list");
        return modelAndView;
    }

    @GetMapping (value = "/eAthlete/athlete/new")
    public String showAthleteForm(Model model){

        List<Athlete> athletes = athleteImplamention.getAllAthletes();

        model.addAttribute("athlete", new Athlete());
        return "athlete/new";
    }

    @PostMapping("eAthlete/athlete/new")
    public String returnView(@Valid @ModelAttribute("athlete") Athlete athlete, Model model, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            model.addAttribute("error",bindingResult.getAllErrors());
           return "athlete/new";
        }
        athlete= athleteImplamention.saveAthlete(athlete);
        return "redirect:/eAthlete/athlete/list";
    }

}
