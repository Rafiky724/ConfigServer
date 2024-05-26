package com.co.jhonan.microservice_one.microservice_one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.jhonan.microservice_one.microservice_one.models.entity.Configuration;

@RestController
public class MicroServiceController {
	@Autowired
    Configuration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }

}
