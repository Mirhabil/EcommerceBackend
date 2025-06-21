package com.example.ecommerce_backend.controller;

import com.example.ecommerce_backend.entity.ClothesEntity;
import com.example.ecommerce_backend.manager.ClothesManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ecommerceApi")
@RestController
@RequiredArgsConstructor
public class ClothesController {


    private final ClothesManager clothesManager;

//    ClothesManager clothesManager=new ClothesManager();

    @GetMapping("/allClothes")
    List<ClothesEntity> getAllClothes() {
        return clothesManager.getAllClothes();
    }

    @PostMapping("/addClothes")
    void addClothes(@RequestBody ClothesEntity clothesEntity) {
        clothesManager.addClothes(clothesEntity);
    }

    @DeleteMapping("/deleteClothes")
    void deleteClothes(@RequestBody ClothesEntity clothesEntity) {
        clothesManager.deleteClothes(clothesEntity);
    }

    @PutMapping("/updateClothes")
    void updateClothes(@RequestBody ClothesEntity clothesEntity) {
        clothesManager.updateClothes(clothesEntity.getClothesId());
    }

    @GetMapping("/getClothesById/{id}")
    ClothesEntity getClothesById(@PathVariable int id) {
        return clothesManager.getClothesById(id);
    }


}
