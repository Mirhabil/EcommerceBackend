package com.example.ecommerce_backend.repository;

import com.example.ecommerce_backend.entity.ClothesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClothesRepository extends JpaRepository<ClothesEntity, Integer> {

    List<ClothesEntity> findByCategoryId(String categoryId);
}
