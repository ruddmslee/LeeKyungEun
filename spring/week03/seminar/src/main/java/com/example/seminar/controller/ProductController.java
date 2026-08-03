package com.example.seminar.controller;

import com.example.seminar.dto.Product;
import com.example.seminar.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // MVC 실습
//    @GetMapping("/products")
//    public String viewProducts(Model page) {
//        var products = productService.findAll();
//        page.addAttribute("products", products);
//
//        return "products";
//    }
//
//    @PostMapping("/products")
//    public String addProduct(Product product,
//                             Model page) {
//        productService.addProduct(product);
//
//        var products = productService.findAll();
//        page.addAttribute("products", products);
//
//        return "products";
//    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.findAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

}
