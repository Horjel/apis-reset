package com.jorge.apisreset.hellohttpapi.controller;

import com.jorge.apisreset.hellohttpapi.model.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    @GetMapping
    public GreetingResponse getGreeting() {
        return new GreetingResponse("Welcome to APIS RESET", "hello-http-api");
    }
}
