package com.example.inventory_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public boolean isInStock(String skuCode){
        return productRepository.existsBySkuCode(skuCode);
    }
}
