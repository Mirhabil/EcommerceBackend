package com.example.ecommerce_backend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    @Id
    private Integer id;


    @JsonManagedReference
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    List<ClothesEntity> clothesList;

    @Column
    String categoryName;
}
