package com.example.webStore.Repositories;

import com.example.webStore.Models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
