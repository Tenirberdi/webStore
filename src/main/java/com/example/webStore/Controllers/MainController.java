package com.example.webStore.Controllers;

import com.example.webStore.Services.CommonService;
import com.example.webStore.Services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    StatisticsService statisticsService;



    @GetMapping("/")
    public String getStarted(Model model){

        model.addAttribute("categories", statisticsService.getCategories());
        model.addAttribute("products", statisticsService.getProducts());
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "loginAdmin";
    }
}
