package com.duong.firstSpringBoot.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "publishedYear")
    private int publishedYear;
    @Column(name = "status")
    private String status;
    public Book() {}
    public Book(String title, String author, int publishedYear, String status) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.status = status;
    }
    public Book(Long id, String title, String author, int publishedYear, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public Long getId() {
        return id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
      return "id: " + this.id + " | ten: " + this.title + " | tac gia: " +
              this.author + " | nam xuat ban: " + this.publishedYear + " | trang thai: " + this.status;
    }
}
