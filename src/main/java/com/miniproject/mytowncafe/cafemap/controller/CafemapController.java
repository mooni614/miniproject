package com.miniproject.mytowncafe.cafemap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CafemapController {


    @GetMapping("/cafemap/mapMain")
    String mapMain(){

        return "cafemap/mapMain";

    }

}
