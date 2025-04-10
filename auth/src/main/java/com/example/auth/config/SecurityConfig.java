package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .requestMatchers("/public/**").permitAll()  // Allow public access to certain endpoints
            .anyRequest().authenticated()  // Authenticate any other requests
            .and()
            .formLogin()
            .permitAll()  // Allow form login for everyone
            .and()
            .logout()
            .permitAll();  // Allow logout for everyone
        
        return http.build();
    }
}
