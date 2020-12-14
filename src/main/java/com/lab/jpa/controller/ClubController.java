package com.lab.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/club")
public class ClubController {
    
    @GetMapping(value = {"/"})
    public String read(){
    return "club_page";
    }
}