package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="coolcompany")
@Component
public class CoolCompanyEndpoint {
    @ReadOperation
    @Bean
    public String coolcompany() {
        return "Hi from my Cool Company.";
    }
}