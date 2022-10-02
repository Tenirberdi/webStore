package com.example.webStore.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int quantity;
    private String Manufacturer;
    private String description;
    private int price;
    private String photo;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category categoryId;

}
