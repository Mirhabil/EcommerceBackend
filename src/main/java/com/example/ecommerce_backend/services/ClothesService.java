package com.example.ecommerce_backend.services;


import com.example.ecommerce_backend.entity.ClothesEntity;

import java.util.List;

public interface ClothesService {

    List<ClothesEntity> getAllClothes();
    void addClothes(ClothesEntity clothesEntity);
    void deleteClothes(ClothesEntity clothesEntity);

    List<ClothesEntity> getClothesByCategoryId(String categoryId);

}
