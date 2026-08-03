package com.example.seminar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // QueryParameter
//    @GetMapping("/home")
//    public String home(
//            @RequestParam(required = false) String username,
//            @RequestParam(required = false) String color,
//            Model page) {
//        page.addAttribute("username", username);
//        page.addAttribute("color", color);
//        return "home";
//    }

    // PathVariable
    @GetMapping("/home/{color}")
    public String home(@PathVariable String color, Model page) {
        page.addAttribute("username", "babylion");
        page.addAttribute("color", color);
        return "home";
    }

}
