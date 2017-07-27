package com.example.sayed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("message","This is Sayed's message");
        return "home";
    }

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("message", "HELLO!");
        return "Hello";
    }
}
