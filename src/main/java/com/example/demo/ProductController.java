package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
        /*
        return Arrays.asList(
                new Product(
                        "jens",
                        "jens Retina 13.3' ME662 (2013)",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img1.jpeg",
                        5,
                        2399
                ),
                new Product(
                        "stijn",
                        "Macbook Pro 13.3' Retina MF841LL/A",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img2.jpeg",
                        3,
                        1199
                ),
                new Product(
                        "tim",
                        "Macbook Pro 15.4' Retina MC975LL/A Model 2012",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img3.jpeg",
                        9,
                        1800
                )
        );
        */
    }
}