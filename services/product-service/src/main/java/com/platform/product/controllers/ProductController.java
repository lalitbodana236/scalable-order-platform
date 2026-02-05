package com.platform.product.controllers;

import com.platform.product.models.Product;
import com.platform.product.services.ProductService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(this.productService.getProductById(id));
    }
    
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.status(200).body(this.productService.getAllProduct());
    }
    
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(product);
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return ResponseEntity.ok(product);
    }
    
    @PutMapping
    public ResponseEntity<Product> replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return ResponseEntity.ok(product);
    }
    
    @DeleteMapping
    public ResponseEntity deleteMapping(@PathVariable("id") Long id) {
        return ResponseEntity.status(204).build();
    }
    
}
