package com.duong.firstSpringBoot;
import java.util.List;
import com.duong.firstSpringBoot.entity.Product;
import com.duong.firstSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	// 3. Ghi đè hàm run(). Đây là sân chơi để bạn test code!
	@Override
	public void run(String... args) throws Exception {
		System.out.println("====== BẮT ĐẦU TEST MODULE SẢN PHẨM ======");
		Product pr1 = new Product("suaMilo", "sua", 25000.55, 35);
		Product pr2 = new Product("suaVilaMilk", "sua", 27000.56, 24);
		Product pr3 = new Product("lays", "snack", 10000.500, 65);
		Product pr4 = new Product("Oshi", "snack", 5000, 47);
		Product pr5 = new Product("hao hao", "mi", 4000.500, 87);
		productService.addProduct(pr1);
		productService.addProduct(pr2);
		productService.addProduct(pr3);
		productService.addProduct(pr4);
		System.out.println("test thu getAllProduct");
		List<Product> list = productService.getAllProduct();
		for(Product x : list) {
			System.out.println(x);
		}
		System.out.println("test thu updatePriceProduct voi id = 1");
		productService.updatePrice(11L, 30000.555);
		System.out.println("danh sach sau khi update la: ");
		List<Product> listUpdate = productService.getAllProduct();
		for(Product x : listUpdate) {
			System.out.println(x);
		}
		System.out.println(" test thu delete san pham id = 3");
		productService.deleteProduct(10L);
		System.out.println("danh sach sau khi xoa la");
		List<Product> listDelete = productService.getAllProduct();
		for(Product x : listDelete) {
			System.out.println(x);
		}
		System.out.println("====== TEST KẾT THÚC ======");
	}
}