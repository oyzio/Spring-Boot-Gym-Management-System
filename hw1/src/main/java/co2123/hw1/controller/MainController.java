package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    //GET And POST reqs to show start view
    @GetMapping("/")
    public String showStartView() {
        return "start";
    }
    @PostMapping("/")
    public String processStartView() {
        return "start";
    }
}
