package com.example.ecommerce_backend.services;

import com.example.ecommerce_backend.entity.BranchesEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BranchesService {

    void addBranch(BranchesEntity branchEntity);

    List<BranchesEntity> getAllBranches();

    BranchesEntity getBranchById(Integer id);

    void deleteBranchById(Integer id);

}
