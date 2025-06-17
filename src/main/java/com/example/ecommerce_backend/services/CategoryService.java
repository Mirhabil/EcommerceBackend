package com.example.ecommerce_backend.services;

import com.example.ecommerce_backend.entity.CategoryEntity;
import com.example.ecommerce_backend.entity.ClothesEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> getAllCategories();
    void addCategories(CategoryEntity clothesEntity);
    void deleteCategories(CategoryEntity clothesEntity);

    CategoryEntity getCategoryById(int id);
}
