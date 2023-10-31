package com.miniproject.mytowncafe.reviewboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewboardController {


    @GetMapping("/reviewboard/boardMain")
    String boardMain(){

        return "reviewboard/boardMain";

    }


    @GetMapping("/reviewboard/boardWrite")
    String boardWrite(){

        return "reviewboard/boardWrite";

    }


    @GetMapping("/reviewboard/boardDetail")
    String boardDetail(){

        return "reviewboard/boardDetail";

    }

}
