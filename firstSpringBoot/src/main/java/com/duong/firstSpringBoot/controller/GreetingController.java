package com.duong.firstSpringBoot.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings") // Đường dẫn gốc cho toàn bộ class này
public class GreetingController {
    // URL: http://localhost:8080/api/greetings/search?name=duong
    @GetMapping("/search")
    public String name(@RequestParam(name = "name") String name) {
        return "chao mung " + name;
    }
    // URL: http://localhost:8080/api/greetings/user23
    @GetMapping("/user{id}")
    public String getID(@PathVariable("id") int ID) {
        return "dang kiem tra thong tin sinh vien co ID: " + ID;
    }
}