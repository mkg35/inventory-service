package com.example.inventory_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{skuCode}")
    public boolean isInStock(@PathVariable String skuCode) throws InterruptedException{
        Thread.sleep(5000);
        return productService.isInStock(skuCode);
    }

}
