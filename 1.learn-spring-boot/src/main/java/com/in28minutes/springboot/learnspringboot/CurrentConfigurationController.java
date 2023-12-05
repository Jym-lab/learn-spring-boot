package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrentConfigurationController {

    @Autowired
    private CurrentServiceConfiguration configuration;

    @RequestMapping("/current-configuration")
    public CurrentServiceConfiguration retrieveAllCourses() {
        return configuration;
    }
}
