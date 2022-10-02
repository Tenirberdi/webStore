package com.example.webStore.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class CommonService {

    public void storePhoto(String directoryName, MultipartFile photo) throws Exception {
        String userDir = System.getProperty("user.dir").replace("\\", "/");
        if(directoryName == null){
            directoryName = "products/";
        }else if(directoryName.substring(directoryName.length() -1) != "/"){
            directoryName += "/";
        }
        String photoPath = userDir + "/src/main/resources/static/images/" + directoryName;

        try {
            File path = new File(photoPath + photo.getOriginalFilename());
            path.createNewFile();
            FileOutputStream output = new FileOutputStream(path);
            output.write(photo.getBytes());
            output.close();
        } catch (Exception e) {
            throw new Exception("Error while storing a photo to directory: " + e.getMessage());
        }
    }


}
