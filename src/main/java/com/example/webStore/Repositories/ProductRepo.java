package com.example.webStore.Repositories;

import com.example.webStore.Models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
    @Query(value = "SELECT sum(quantity) as quantity FROM `product` WHERE 1", nativeQuery = true)
    Integer getTotalQuantity();


}
