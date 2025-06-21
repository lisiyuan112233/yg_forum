package com.sia.fileservice;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class uploadController {
    @Value("${file.path}")
    private String UPLOAD_DIR;



    @PostMapping("/img")
    @ResponseBody
    public Map<String,Object> uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        try {
            if (file.isEmpty()) {
                return Map.of("code", 0, "message", "文件为空");
            }

            // 生成唯一文件名，避免重名
            String fileName = UUID.randomUUID().toString().replaceAll("-","") + "_" + file.getOriginalFilename();
            Path uploadPath = Paths.get(UPLOAD_DIR);

            // 确保上传目录存在
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            // 保存文件
            Path filePath = uploadPath.resolve(fileName);
            file.transferTo(filePath);

            return Map.of("code", 1, "msg", "文件上传成功", "data", "/static/img/" + fileName);
        } catch (IOException e) {
            return Map.of("code", 0, "msg", "文件上传失败");
        }
    }
    @GetMapping("/get")
    public String getUploadPage(){
        return "upload";
    }
}
