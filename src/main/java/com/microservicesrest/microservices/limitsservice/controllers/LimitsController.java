package com.microservicesrest.microservices.limitsservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservicesrest.microservices.limitsservice.pojos.Limits;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(1,1000);
    }

}
