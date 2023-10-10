package com.example.jenkins.jenkins1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping(value = "/asd")
    public String test(){
        System.out.println("test");
        return "조진호";
    }
}
