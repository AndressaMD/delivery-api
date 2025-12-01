package com.delivery_api.Projeto.Delivery.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health(){
       return Map.of(
               "status", "UP",
               "timestamp", LocalDateTime.now().toString(),
               "Service", "Delivery API"
       );

    }

//    @GetMapping("/info")
//    public AppInfo info() {
//        return new AppInfo(
//                "Delivery Tech API",
//                "1.0.0",
//                "[Seu Nome]",
//                "JDK 21",
//                "Spring Boot 3.2.x"
//        );
//    }

}

