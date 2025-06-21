package com.example.ecommerce_backend.manager;

import com.example.ecommerce_backend.entity.ClothesEntity;
import com.example.ecommerce_backend.repository.ClothesRepository;
import com.example.ecommerce_backend.services.ClothesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClothesManager implements ClothesService {


    private final ClothesRepository clothesRepository;

    @Override
    public List<ClothesEntity> getAllClothes() {
        return clothesRepository.findAll();
    }

    @Override
    public void addClothes(ClothesEntity clothesEntity) {
        clothesRepository.save(clothesEntity);
    }

    @Override
    public void deleteClothes(ClothesEntity clothesEntity) {
        clothesRepository.delete(clothesEntity);
    }

    @Override
    public void updateClothes(int clothesId) {
        clothesRepository.findById(clothesId).map(clothes-> {
            clothes.setFavorite(!clothes.isFavorite());
            return clothesRepository.save(clothes);
        }).orElseThrow(() -> new RuntimeException("User not found with ID: " + clothesId));;
    }

    @Override
    public ClothesEntity getClothesById(int clothesId) {
        return clothesRepository.findById(clothesId).get();
    }


}
