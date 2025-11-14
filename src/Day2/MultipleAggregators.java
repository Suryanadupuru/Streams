package Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MultipleAggregators {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product("Laptop", 999.99),
			    new Product("Mouse", 25.50),
			    new Product("Keyboard", 75.00),
			    new Product("Monitor", 299.99)
			);
		Product expensiveProduct=products.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
		System.out.println(expensiveProduct);
		Product cheapestProduct=products.stream().min(Comparator.comparingDouble(Product::getPrice)).orElse(null);
		System.out.println(cheapestProduct);
		Double totalValue=products.stream().mapToDouble(Product::getPrice).sum();
		System.out.println(totalValue);
	}

}
class Product {
    String name;
    double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
    
}