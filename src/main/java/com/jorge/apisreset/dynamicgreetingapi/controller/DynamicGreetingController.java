package com.jorge.apisreset.dynamicgreetingapi.controller;

import com.jorge.apisreset.dynamicgreetingapi.model.DynamicGreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class DynamicGreetingController {

    @GetMapping("/{name}")
    public DynamicGreetingResponse getGreeting(
            @PathVariable("name") String name,
            @RequestParam(name = "formal", defaultValue = "false") boolean formal) {

        String message = formal
                ? "Good day, " + name + "."
                : "Hello, " + name + "!";

        return new DynamicGreetingResponse(message, name, formal);
    }
}
