package com.firstapp.first_spring_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController is a combo of @Controller + @ResponseBody
@RequestMapping("/sample/apis")
//@RequestMapping maps the request coming from FrontEnd to Controller Class

public class SampleController {

    @GetMapping("/getSample")
    public String sampleApi(){
        return "This is our first API";
    }

    @GetMapping("/getSample2")
    public String sampleApi2(){
        return  "This is our second API";
    }
}
