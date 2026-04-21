package com.duong.firstSpringBoot.service;
import com.duong.firstSpringBoot.entity.Product;
import com.duong.firstSpringBoot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getAllProduct() {
        List<Product> list = productRepository.findAll();
        return list;
    }
    public Product updatePrice(Long id, double price) {
        Product product = productRepository.findById(id).orElseThrow(() -> new
                RuntimeException("Loi! khong tim thay san pham co id: " + id));
        product.setPrice(price);
        return productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
 }
