package com.example.ecommerce_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "clothes")
public class ClothesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer clothesId;

    @Column
    String clothesName;

    @Column
    String clothesCompany;

    @Column
    boolean isNew;

    @Column
    boolean isTrending;

    @Column
    boolean isRecent;

    @Column
    Integer quantity;

    @Column
    Double price;

    @Column
    Integer stock;

    @Column
    Integer totalStock;

//    @JoinColumn(name = "category_id",nullable = false)
//    @JsonBackReference
//    @ManyToOne()
//    CategoryEntity category;

    @Column(name = "category_id")
    String categoryId;

    @Column
    String clothesImage;

}
