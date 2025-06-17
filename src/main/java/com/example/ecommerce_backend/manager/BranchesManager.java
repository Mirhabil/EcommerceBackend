package com.example.ecommerce_backend.manager;

import com.example.ecommerce_backend.entity.BranchesEntity;
import com.example.ecommerce_backend.repository.BranchesRepository;
import com.example.ecommerce_backend.services.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesManager implements BranchesService {

    @Autowired
    BranchesRepository branchesRepository;

    @Override
    public void addBranch(BranchesEntity branchEntity) {
        branchesRepository.save(branchEntity);
    }

    @Override
    public List<BranchesEntity> getAllBranches() {
        return branchesRepository.findAll();
    }

    @Override
    public BranchesEntity getBranchById(Integer id) {
        return branchesRepository.findById(id).get();
    }

    @Override
    public void deleteBranchById(Integer id) {
        branchesRepository.deleteById(id);
    }
}
