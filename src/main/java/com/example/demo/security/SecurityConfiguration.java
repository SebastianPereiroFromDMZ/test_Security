package com.example.demo.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
@AllArgsConstructor
public class SecurityConfiguration {

    public SecurityFilterChain securityFilterChain (HttpSecurity http){
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/registration").permitAll())
    }
}
