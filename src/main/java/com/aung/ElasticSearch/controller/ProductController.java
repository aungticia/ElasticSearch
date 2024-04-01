package com.aung.ElasticSearch.controller;

import com.aung.ElasticSearch.model.Product;
import com.aung.ElasticSearch.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductRepo repo;

    // Get All Products
    @GetMapping("/")
    public ResponseEntity<Object> searchAllProducts() throws IOException {
        List<Product> products = repo.searchAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Create or Update all Products
    @PostMapping("/createOrUpdateProduct")
    public ResponseEntity<Object> createOrUpdateProduct(@RequestBody Product product) throws IOException {
        String response = repo.createOrUpdateProduct(product);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Get Products by Id
    @GetMapping("/getProduct")
    public ResponseEntity<Object> getProductById(@RequestParam String productId) throws IOException {
        Product product =  repo.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Delete Product
    @DeleteMapping("/deleteProduct")
    public ResponseEntity<Object> deleteProductById(@RequestParam String productId) throws IOException {
        String response =  repo.deleteProductById(productId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
