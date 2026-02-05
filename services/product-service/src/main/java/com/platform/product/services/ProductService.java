package com.platform.product.services;

import com.platform.product.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId);
    
    List<Product> getAllProduct();
}
