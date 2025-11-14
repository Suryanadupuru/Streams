package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekDebugging {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "Apricot");
		List<String> result = words.stream()
			.peek(word -> System.out.println("Original "+ word))
		    .filter(s -> s.startsWith("a"))
		    .peek(word->System.out.println("After filter "+ word))
		    .map(String::toUpperCase)
		    .peek(word->System.out.println("After uppercase "+word))
		    .collect(Collectors.toList());
		
		System.out.println(result);
		
		
		List<String> result1 = words.stream()
			    .filter(s -> s.toLowerCase().startsWith("a"))
			    .map(String::toUpperCase)
			    .collect(Collectors.toList());
			
			System.out.println(result1);
	}

}
