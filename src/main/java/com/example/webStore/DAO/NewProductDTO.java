package com.example.webStore.DAO;

import lombok.Data;

@Data
public class NewProductDTO {
    String name;
    int quantity;
    String description;
    int price;
    Long category;
    String manufacturer;
}
