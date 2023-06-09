package com.example.productApp.repositories;

import com.example.productApp.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Category findById(int id);
}