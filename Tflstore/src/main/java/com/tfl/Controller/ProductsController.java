package com.tfl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tfl.Entity.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller
public class ProductsController {

    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    public ProductsController() {
        System.out.println("Products Controller instance initialized......");
    }

    @GetMapping("/products")
    public String index(Model model) {
        // Fetch data from ProductManager
        List<Product> allProducts = ProductManager.getAllProducts();
        
        // Send list of products to Model
        model.addAttribute("catalog", allProducts);
        
        return "products/index"; // Return the view for products catalog
    }
}