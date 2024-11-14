package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class GymController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new GymValidator());
    }


    //GET request for showing list of gyms
    @GetMapping("/gyms")
    public String showGymList(Model model) {

        model.addAttribute("gyms", Hw1Application.gyms);
        return "gyms/list";
    }



    //GET and POST request for adding a new gym
    @GetMapping("/newGym")
    public String showGymForm(Model model) {
        model.addAttribute("gym", new Gym());
        return "gyms/form";
    }

    @PostMapping("/addGym")
    public String addGym(@Valid @ModelAttribute Gym gym, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "gyms/form";
        }
        //gym.setId(Hw1Application.gyms.size()+1); IF GYM ID WAS AUTOMATIC
        Hw1Application.gyms.add(gym);
        return "redirect:/gyms";
    }

}
