package ua.beerfive.brewery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ua.beerfive.brewery.model.dto.Product;
import ua.beerfive.brewery.model.repos.ProductRepository;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ProductController {

//    @Autowired
//    private ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts(Model model) {
        return "products";
    }

    @GetMapping("/product/2")
    public String getProductDetails(@PathVariable(value = "id") long id, Model model) {
//        if(!productRepository.existsById(id))
//            return "redirect:/blog";
//
//        Optional<Product> post = productRepository.findById(id);
//        ArrayList<Product> res = new ArrayList<>();
//        post.ifPresent(res::add);
//        model.addAttribute("product", res);
        return "product-details";
    }
}
