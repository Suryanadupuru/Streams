package Day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedFlatMap {

	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction(Arrays.asList(
			        new Item("Laptop", 1, 999.99),
			        new Item("Mouse", 2, 25.50)
			    )),
			    new Transaction(Arrays.asList(
			        new Item("Mouse", 1, 25.50),
			        new Item("Keyboard", 1, 75.00)
			    ))
			);
			Map<String, Double> totalRevenue = transactions.stream()
					.flatMap(transaction ->transaction.getItems().stream())
					.collect(Collectors.groupingBy(Item::getProductName,Collectors.summingDouble(item->item.getPrice()*item.getQuantity())));
			
		System.out.println(totalRevenue);
			    

	}

}
class Transaction {
    List<Item> items;

	public Transaction(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}
    
}
class Item {
    String productName;
    int quantity;
    double price;

	public Item(String productName, int quantity, double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	
}