package ua.beerfive.brewery.controller.handler;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class AccessHandler {
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/products").permitAll()
                .antMatchers("/profile").hasRole("USER")
                .and()
                .formLogin().permitAll()
                .defaultSuccessUrl("/products")
                .and()
                .logout().permitAll();
    }
}
