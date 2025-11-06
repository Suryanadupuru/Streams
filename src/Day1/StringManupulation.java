package Day1;
import java.util.*;

public class StringManupulation {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
		words.stream().map(String->String.toUpperCase()).filter(string->string.startsWith("A")).forEach(string->System.out.println(string));
	}

}
