package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingPractice {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");
		
		Map<Object, Long> count=words.stream().collect(Collectors.groupingBy(word->word.charAt(0),Collectors.counting()));
		
		System.out.println(count);

	}

}
