package com.makro.controllers;

import com.makro.model.SimpleTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeGetter {
    @GetMapping("/time")
    public SimpleTime greeting() {
        return new SimpleTime("Marcelina", 4.17f);
    }
}
