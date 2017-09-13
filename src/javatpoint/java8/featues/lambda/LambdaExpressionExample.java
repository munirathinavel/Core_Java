package javatpoint.java8.featues.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("qqwqw");
		list.add("234234");
		list.add("234234");
		list.add("34234");

		list.forEach((n) -> System.out.println(n));

		List<Product> list1 = new ArrayList<Product>();

		// Adding Products
		list1.add(new Product(1, "HP Laptop", 25000f));
		list1.add(new Product(3, "Keyboard", 300f));
		list1.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");
		
			Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});

	}
	

}
