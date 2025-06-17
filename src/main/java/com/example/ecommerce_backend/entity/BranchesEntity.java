package com.example.ecommerce_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "branches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_number_first")
    private String branchNumberFirst;

    @Column(name = "branch_number_second")
    private String branchNumberSecond;


}
