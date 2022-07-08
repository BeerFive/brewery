package ua.beerfive.brewery.controller.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/products").setViewName("products");
        registry.addViewController("/").setViewName("products");

        registry.addViewController("/cart").setViewName("cart");

        registry.addViewController("/profile").setViewName("profile");

        registry.addViewController("/product/2").setViewName("product-details");

        registry.addViewController("/communication").setViewName("communication-page");
    }
}
