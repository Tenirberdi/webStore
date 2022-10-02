package com.example.webStore.Services;

import com.example.webStore.DAO.NewProductDTO;
import com.example.webStore.Models.Category;
import com.example.webStore.Models.Product;
import com.example.webStore.Repositories.CategoryRepo;
import com.example.webStore.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    CategoryRepo categoryRepo;
    @Autowired
    CommonService commonService;
    @Autowired
    ProductRepo productRepo;
    public ResponseEntity<HttpStatus> addProduct(NewProductDTO newProductDTO, MultipartFile photo) throws Exception {
        Product newProduct = new Product();

        commonService.storePhoto("products", photo);

        newProduct.setName(newProductDTO.getName());
        newProduct.setCategoryId(categoryRepo.findById(newProductDTO.getCategory()).get());
        newProduct.setDescription(newProductDTO.getDescription());
        newProduct.setPrice(newProductDTO.getPrice());
        newProduct.setQuantity(newProductDTO.getQuantity());
        newProduct.setManufacturer(newProductDTO.getManufacturer());
        newProduct.setPhoto("/images/products/" + photo.getOriginalFilename());

        productRepo.save(newProduct);

        return ResponseEntity.ok(HttpStatus.OK);

    }
    public List<Category> getCategories(){
        List<Category> list = new ArrayList<>();
        categoryRepo.findAll().forEach(list::add);
        return list;
    }
}
