package com.example.ecommerce_backend.controller;

import com.example.ecommerce_backend.entity.BranchesEntity;
import com.example.ecommerce_backend.manager.BranchesManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ecommerceApi")
@RestController
@RequiredArgsConstructor
public class BranchesController {



    @Autowired
    BranchesManager branchesManager;

    @GetMapping("/allBranches")
    List<BranchesEntity> getAllBranches(){
        return branchesManager.getAllBranches();
    }

    @GetMapping("/branches/{id}")
    BranchesEntity getBranchById(@PathVariable int id){
        return branchesManager.getBranchById(id);
    }

    @PostMapping("/addBranch")
    void addBranch(@RequestBody BranchesEntity branchesEntity){
        branchesManager.addBranch(branchesEntity);
    }

    @DeleteMapping("/deleteBranch/{id}")
    void deleteBranch(@PathVariable int id){
        branchesManager.deleteBranchById(id);
    }


}
