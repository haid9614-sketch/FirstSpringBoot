package com.duong.firstSpringBoot.repository;

import com.duong.firstSpringBoot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
  List<Book> findByAuthor(String author);

  @Query("SELECT b FROM Book b WHERE b.status = :trangThai AND b.publishedYear > :nam ")
    List<Book> sachConLocTheoNam(@Param("trangThai") String trangThai, @Param("nam") int nam);

  @Query(value = "SELECT * FROM Book WHERE LOWER(title) LIKE CONCAT('%', LOWER(:key), '%')", nativeQuery = true)
    List<Book> timSachTheoKey(@Param("key") String key);
}


