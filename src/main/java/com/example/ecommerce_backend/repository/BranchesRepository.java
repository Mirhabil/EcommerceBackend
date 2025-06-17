package com.example.ecommerce_backend.repository;

import com.example.ecommerce_backend.entity.BranchesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchesRepository extends JpaRepository<BranchesEntity, Integer> {
}
