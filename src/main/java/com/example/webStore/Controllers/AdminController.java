package com.example.webStore.Controllers;

import com.example.webStore.DAO.Item;
import com.example.webStore.Services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    CommonService commonService;

    @GetMapping(value = "/test1")
    public String test1() throws Exception {
        return "index";
    }
    @GetMapping(value = "/test2")
    public String test2() throws Exception {
        return "cart";
    }
    @GetMapping(value = "/test3")
    public String test3() throws Exception {
        return "category";
    }
}
