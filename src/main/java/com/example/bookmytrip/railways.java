package com.example.bookmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railways {
    @GetMapping("/railways")
    public String getData() {return  "Please Book your train tickets from bookmytrip at 10% discount" ; }
}
