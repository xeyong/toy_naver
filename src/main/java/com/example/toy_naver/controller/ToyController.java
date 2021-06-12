package com.example.toy_naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class ToyController {

    @GetMapping("")
    public String first(){
        return "toy.html";
    }
}
