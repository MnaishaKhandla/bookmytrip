package com.example.bookmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/visa")
    public String getData() {return  "Please get your visa from bookmytrip at 10% discount" ; }
}
