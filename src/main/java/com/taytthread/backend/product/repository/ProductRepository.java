package com.taytthread.backend.product.repository;

import com.taytthread.backend.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
