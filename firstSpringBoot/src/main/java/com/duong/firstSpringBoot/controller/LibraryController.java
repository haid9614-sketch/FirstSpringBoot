package com.duong.firstSpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/libraries")
public class LibraryController {
    // sau dau ?  ?author=name&limit=soluong
    // test URL:  http://localhost:8080/api/libraries/categories/manga/books?author=fujiko&limit=5
    @GetMapping("categories/{ma_the_loai}/books")
    public String searchBook(@RequestParam(name = "author", required = false) String name, @RequestParam(name = "limit", defaultValue = "10") int sL,
                             @PathVariable("ma_the_loai") String id) {
        return "Đang tìm sách thư viện - Thể loại mã: " + id + " Tác giả: " + name + " Giới hạn: " + sL;
    }
}
