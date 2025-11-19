package Day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataTransformation {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("new york", "london", "paris", "tokyo", "sydney");
		// Convert to uppercase, reverse each string, and collect to a new list
		// Expected: ["KROY WEN", "NODNOL", "SIRAP", "OYJOT", "YENDYS"]
		List<String> modifiedList=cities.stream().map(String::toUpperCase).map(s ->new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		System.out.println();
		
	}
}
