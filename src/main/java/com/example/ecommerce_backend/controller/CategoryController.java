package com.example.ecommerce_backend.controller;

import com.example.ecommerce_backend.entity.CategoryEntity;
import com.example.ecommerce_backend.entity.ClothesEntity;
import com.example.ecommerce_backend.manager.CategoryManager;
import com.example.ecommerce_backend.manager.ClothesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ecommerceApi")
@RestController
public class CategoryController {

    @Autowired
    private CategoryManager categoryManager;

//    ClothesManager clothesManager=new ClothesManager();

    @GetMapping("/allCategory")
    List<CategoryEntity> getAllClothes(){
        return categoryManager.getAllCategories();
    }

    @PostMapping("/addCategory")
    void addClothes(@RequestBody CategoryEntity clothesEntity){
        categoryManager.addCategories(clothesEntity);
    }

    @DeleteMapping("/deleteCategory")
    void deleteClothes(@RequestBody CategoryEntity clothesEntity){
        categoryManager.deleteCategories(clothesEntity);
    }

    @GetMapping("/allCategory/{id}")
    CategoryEntity getCategoryById(@PathVariable int id){
        return categoryManager.getCategoryById(id);
    }





}
