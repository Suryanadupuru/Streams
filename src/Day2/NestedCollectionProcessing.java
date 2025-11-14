package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedCollectionProcessing {
	
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(Arrays.asList("Laptop", "Mouse", "Keyboard")),
			    new Order(Arrays.asList("Mouse", "Monitor")),
			    new Order(Arrays.asList("Keyboard", "Headphones", "Mouse"))
			);
		List<String> items=orders.stream().flatMap(order->order.items.stream()).distinct().collect(Collectors.toList());
		System.out.println(items);
		
	}
}
class Order {
    List<String> items;
    public Order(List<String> items) {
    	this.items=items;
    }
    public List<String> getItems(){
    	return this.items;
    }
}