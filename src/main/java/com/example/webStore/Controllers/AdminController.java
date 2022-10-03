package com.example.webStore.Controllers;

import com.example.webStore.DAO.Item;
import com.example.webStore.DAO.NewProductDTO;
import com.example.webStore.Services.AdminService;
import com.example.webStore.Services.CommonService;
import com.example.webStore.Services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CommonService commonService;

    @Autowired
    AdminService adminService;
    @Autowired
    StatisticsService statisticsService;

    @GetMapping(value = "/")
    public String getDashboard(Model model) throws Exception {
        model.addAttribute("productQuantity", statisticsService.getProductsTotalQuantity());
        model.addAttribute("categoryQuantity", statisticsService.getCategoryQuantity());
        model.addAttribute("products", statisticsService.getProducts());
        return "indexAdmin";
    }
    @GetMapping(value = "/addProduct")
    public String addProduct(Model model) throws Exception {
        model.addAttribute("categories" , statisticsService.getCategories());
        model.addAttribute("container" , new NewProductDTO());
        return "forms";
    }
    @GetMapping(value = "/test3")
    public String test3() throws Exception {
        return "category";
    }

    @PostMapping(value="/newProduct", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String addProduct(@ModelAttribute NewProductDTO newProductDTO, RedirectAttributes redirectAttributes, @RequestParam("photo") MultipartFile photo) throws Exception {
        adminService.addProduct(newProductDTO, photo);
        return "redirect:/admin/addProduct";
    }
}
