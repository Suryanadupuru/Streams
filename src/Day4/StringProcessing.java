package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Diana", "David");
		
		List<String> strings = names.stream().map(String::toUpperCase).filter(String->String.startsWith("J")).sorted().collect(Collectors.toList());
		
		System.out.println(strings);
	}

}
