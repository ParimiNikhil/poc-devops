package com.poc.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsPoc {
    
    @GetMapping("/")
    public String Output(){
        return "Devops CICD using git,maven,docker,jenkins & k8s is successfully completed";
}
}
