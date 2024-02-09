package com.example.clmwebsitesupport.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clmWebsiteSupport/api/v1/http")
public class HttpController {

    @GetMapping("log")
    public String keepAwake(){
        System.out.println("Waking...");
        return "I'm awake";
    }
}
