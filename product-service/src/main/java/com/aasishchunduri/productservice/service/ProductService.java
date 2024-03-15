package com.aasishchunduri.productservice.service;


import com.aasishchunduri.productservice.dto.ProductRequest;
import com.aasishchunduri.productservice.dto.ProductResponse;
import com.aasishchunduri.productservice.model.Product;
import com.aasishchunduri.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        System.out.println("This is in service create");
        log.info("Product {} is saved",product.getId());
    }


    public List<ProductResponse> getAllProducts() {
        List<Product> products= productRepository.findAll();
        System.out.println("This is in service get");
        return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());

    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
