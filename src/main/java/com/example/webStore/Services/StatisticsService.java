package com.example.webStore.Services;

import com.example.webStore.Models.Product;
import com.example.webStore.Repositories.CategoryRepo;
import com.example.webStore.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticsService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    CategoryRepo categoryRepo;

    public Integer getProductsTotalQuantity(){
        return productRepo.getTotalQuantity();
    }

    public Integer getCategoryQuantity(){
        return categoryRepo.getCategoryQuantity();
    }

    public List<Product> getProducts(){
        List<Product> list = new ArrayList<Product>();
        productRepo.findAll().forEach(list::add);
        return list;
    }
}
