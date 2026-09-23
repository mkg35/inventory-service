package com.example.inventory_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public boolean existsBySkuCode(String skuCode);
}
