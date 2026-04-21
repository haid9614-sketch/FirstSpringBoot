package com.duong.firstSpringBoot.entity;
import jakarta.persistence.*;
import javax.annotation.processing.Generated;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "category")
    private String category;
    @Column(name = "price")
    private double price;
    @Column(name = "stockQuantity")
    private int stockQuantity;
    public Product() {}
    public Product(Long id, String productName, String category, double price, int stockQuantity) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public Product(String productName, String category, double price, int stockQuantity) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public Long getid() {
        return id;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getProductName() {
        return productName;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setid(Long id) {
        id = id;
    }
    @Override
    public String toString() {
        return "ID: " + this.id + " | ten san pham: " + this.productName
                + " | phan loai: " + this.category + " | gia: " + this.price + " | ton kho: " + this.stockQuantity;
    }
}

