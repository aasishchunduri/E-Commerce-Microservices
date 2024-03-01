package com.aasishchunduri.productservice.repository;

import com.aasishchunduri.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

}
