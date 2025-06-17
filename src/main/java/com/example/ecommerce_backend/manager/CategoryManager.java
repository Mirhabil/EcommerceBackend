package com.example.ecommerce_backend.manager;

import com.example.ecommerce_backend.entity.CategoryEntity;
import com.example.ecommerce_backend.repository.CategoryRepository;
import com.example.ecommerce_backend.repository.ClothesRepository;
import com.example.ecommerce_backend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategories(CategoryEntity clothesEntity) {
        categoryRepository.save(clothesEntity);
    }

    @Override
    public void deleteCategories(CategoryEntity clothesEntity) {
        categoryRepository.delete(clothesEntity);

    }

    @Override
    public CategoryEntity getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }
}
