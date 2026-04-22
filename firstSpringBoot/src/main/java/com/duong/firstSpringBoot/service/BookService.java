package com.duong.firstSpringBoot.service;

import com.duong.firstSpringBoot.entity.Book;
import com.duong.firstSpringBoot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
@Autowired
private BookRepository bookRepository;
   public Book addBook(Book book) {
      return bookRepository.save(book);
   }
   public void deleteBook(Long id) {
       bookRepository.deleteById(id);
   }
   public List<Book> timTheoTacGia(String ten) {
       return bookRepository.findByAuthor(ten);
   }
   public List<Book> sachLocTheoNam(String trangThai, int nam) {
       return bookRepository.sachConLocTheoNam(trangThai, nam);
   }
   public List<Book> timSachTheoKey(String key) {
       return bookRepository.timSachTheoKey(key);
   }
}
