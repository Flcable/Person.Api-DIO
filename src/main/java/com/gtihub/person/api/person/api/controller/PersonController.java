package com.gtihub.person.api.person.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;




@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getBook(){
        return "API Test";
    }
}
