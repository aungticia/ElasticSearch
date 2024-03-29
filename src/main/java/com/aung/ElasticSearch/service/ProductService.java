package com.aung.ElasticSearch.service;


import com.aung.ElasticSearch.entity.Product;
import com.aung.ElasticSearch.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    // Find all the list of product
    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    // Insert the product
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    // Update the product
    public Product updateProduct(Product product, int id) {
        Product p = productRepo.findById(id).get();
        p.setPrice(product.getPrice());
        return p;
    }

    // Delete the product
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
