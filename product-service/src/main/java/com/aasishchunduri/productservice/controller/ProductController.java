package com.aasishchunduri.productservice.controller;


import com.aasishchunduri.productservice.dto.ProductRequest;
import com.aasishchunduri.productservice.dto.ProductResponse;
import com.aasishchunduri.productservice.model.Product;
import com.aasishchunduri.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        System.out.println("Coming here in get");
        return productService.getAllProducts();
    }


}
