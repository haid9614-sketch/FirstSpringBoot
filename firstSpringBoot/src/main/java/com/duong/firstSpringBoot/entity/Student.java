package com.duong.firstSpringBoot.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    public Student () {}
    public Student(Integer studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "ma sinh vien " + this.studentId + " | ten: " + this.name + " | tuoi: " + this.age;
     }
}
