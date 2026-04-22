package com.duong.firstSpringBoot;
import java.util.List;
import com.duong.firstSpringBoot.entity.Book;
import com.duong.firstSpringBoot.entity.Product;
import com.duong.firstSpringBoot.service.BookService;
import com.duong.firstSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
	@Autowired
	private ProductService productService;
    @Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}
	// 3. Ghi đè hàm run(). Đây là sân chơi để bạn test code!
	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book("Chí Phèo", "Nam Cao", 1941, "AVAILABLE");
		Book b2 = new Book("Lão Hạc", "Nam Cao", 1943, "BORROWED");
		Book b3 = new Book("Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 2010, "AVAILABLE");
		Book b4 = new Book("Clean Code - Lập trình sạch", "Robert C. Martin", 2008, "AVAILABLE");
		Book b5 = new Book("Giáo trình Lập trình Java", "Học viện PTIT", 2021, "BORROWED");
        bookService.addBook(b1);
		bookService.addBook(b2);
		bookService.addBook(b3);
		bookService.addBook(b4);
        bookService.addBook(b5);
		System.out.println(" TEST TIM SACH THEO TAC GIA");
		List<Book> listTest1 = bookService.timTheoTacGia("Nam Cao");
        for(Book x : listTest1) {
			System.out.println(x);
		}
		System.out.println(" TEST TIM SACH AVAILABLE SAU NAM 2006");
        List<Book> listTest2 = bookService.sachLocTheoNam("AVAILABLE", 2006);
		for(Book x : listTest2) {
			System.out.println(x);
		}
		System.out.println("TEST TIM SACH THEO KEY");
		List<Book> listTest3 = bookService.timSachTheoKey("lap trinh");
		for(Book x : listTest3) {
			System.out.println(x);
		}
//		System.out.println("====== BẮT ĐẦU TEST MODULE SẢN PHẨM ======");
//		Product pr1 = new Product("suaMilo", "sua", 25000.55, 35);
//		Product pr2 = new Product("suaVilaMilk", "sua", 27000.56, 24);
//		Product pr3 = new Product("lays", "snack", 10000.500, 65);
//		Product pr4 = new Product("Oshi", "snack", 5000, 47);
//		Product pr5 = new Product("hao hao", "mi", 4000.500, 87);
//		productService.addProduct(pr1);
//		productService.addProduct(pr2);
//		productService.addProduct(pr3);
//		productService.addProduct(pr4);
//		System.out.println("test thu getAllProduct");
//		List<Product> list = productService.getAllProduct();
//		for(Product x : list) {
//			System.out.println(x);
//		}
//		System.out.println("test thu updatePriceProduct voi id = 1");
//		productService.updatePrice(11L, 30000.555);
//		System.out.println("danh sach sau khi update la: ");
//		List<Product> listUpdate = productService.getAllProduct();
//		for(Product x : listUpdate) {
//			System.out.println(x);
//		}
//		System.out.println(" test thu delete san pham id = 3");
//		productService.deleteProduct(10L);
//		System.out.println("danh sach sau khi xoa la");
//		List<Product> listDelete = productService.getAllProduct();
//		for(Product x : listDelete) {
//			System.out.println(x);
//		}
//		System.out.println("====== TEST KẾT THÚC ======");
	}
}