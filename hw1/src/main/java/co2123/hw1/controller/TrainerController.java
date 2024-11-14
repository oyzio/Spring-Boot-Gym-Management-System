package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrainerController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new TrainerValidator());
    }

    //GET request for showing list of trainers
    @GetMapping("/trainers")
    public String showTrainerList(@RequestParam("gym") int gym, Model model) {

        Gym selectedGym = null;

        for (Gym g :Hw1Application.gyms){
            if (g.getId() == gym){
                selectedGym = g;
                break;
            }
        }

        if (selectedGym != null){
            model.addAttribute("trainers", selectedGym.getTrainers());
            model.addAttribute("gym", gym);
        }

        return "trainers/list";
    }



    //GET and POST request for adding a new trainer
    @GetMapping("/newTrainer")
    public String showTrainerForm(@RequestParam("gym") int gym, Model model) {
        Trainer trainer = new Trainer();
        model.addAttribute("trainer", trainer);
        model.addAttribute("gym", gym);
        return "trainers/form";
    }


    @PostMapping("/addTrainer")
    public String addTrainer(@Valid @ModelAttribute Trainer trainer, BindingResult result,
                             @RequestParam(value ="gym", defaultValue = "0") int gym, Model model) {


        if (result.hasErrors()) {
            model.addAttribute("trainer", trainer);
            model.addAttribute("gym", gym);
            return "trainers/form";
        }

        Gym selectedGym = null;

        if (gym != 0){
            for (Gym g :Hw1Application.gyms){
                if (g.getId() == gym){
                    selectedGym = g;
                    break;
                }
            }
        }

        if (selectedGym != null){
            selectedGym.getTrainers().add(trainer);
        }

        return "redirect:/gyms";
    }

}
