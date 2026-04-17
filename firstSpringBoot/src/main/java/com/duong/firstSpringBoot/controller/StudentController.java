package com.duong.firstSpringBoot.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
@RestController
@RequestMapping("api/student")
public class StudentController {
    private List<String> list = new ArrayList<>(List.of("Duong", "Tuan", "Lan"));
    // lay toan bo danh sach sinh vien
    // http://localhost:8080/api/student
    @GetMapping
    public List<String> allstudent() {
        return list;
    }
    // lay thong tin sinh vien = id
    // http://localhost:8080/api/student/student23
    @GetMapping("student{id}")
    public String getStudentByID(@PathVariable("id") int ID) {
        return "Dang lay thong tin sinh vien co ID: " + ID;
    }
    // kiem tra thong tin sinh vien = name
    // http://localhost:8080/api/student/search?name=duong
    @GetMapping("/search")
    public String search(@RequestParam(name = "name") String name) {
        return "dang kiem tra sinh vien ten: " + name;
    }
    // xoa sinh vien = Id
    // http://localhost:8080/api/student/1
    @DeleteMapping("/{id}")
    public String deleteStuden(@PathVariable("id") int Id) {
        list.remove(Id);
        return "da xoa sinh vien Id: " + Id;
    }
    // them sinh vien
    @PostMapping
    public String addStudent(@RequestBody String newStudent) {
        list.add(newStudent);
        return "da them sinh vien: " + newStudent;
    }
    // update sinh vien = id
    // gia su id la idex cua sinh vien trong list
    @PutMapping("{id}")
    public String updateStudent(@PathVariable("id") int index, @RequestBody String updateStudent) {
        list.set(index, updateStudent);
        return "da update sinh vien ID: " + index + " thanh: " + updateStudent;
    }
}