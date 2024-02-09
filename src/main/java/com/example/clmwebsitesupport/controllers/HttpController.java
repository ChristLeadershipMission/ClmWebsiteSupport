package com.example.clmwebsitesupport.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clmWebsiteSupport/api/v1/http")
@Slf4j
public class HttpController {

    @GetMapping("log")
    public ResponseEntity<String> log() {
        log.info("Called to remain active");
        return ResponseEntity.ok().body("Thanks Server, your support is active");
    }
}
