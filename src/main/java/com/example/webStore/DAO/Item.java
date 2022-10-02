package com.example.webStore.DAO;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class Item {
    private MultipartFile image;
}
