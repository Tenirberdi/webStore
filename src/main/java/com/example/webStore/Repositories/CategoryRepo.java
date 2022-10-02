package com.example.webStore.Repositories;

import com.example.webStore.Models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {

    @Query(value="SELECT COUNT(id) as quantity FROM category WHERE 1", nativeQuery = true)
    Integer getCategoryQuantity();
}
