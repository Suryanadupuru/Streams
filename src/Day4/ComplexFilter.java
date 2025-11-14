package Day4;

import java.util.Arrays;
import java.util.List;

public class ComplexFilter {

	public static void main(String[] args) {
		List<String> mixed = Arrays.asList("Java", "123", "Stream45", "API", "9876", "Lambda");
		int sum = mixed.stream().filter(str ->str.matches("\\d+"))
						.map(Integer::parseInt)
						.mapToInt(Integer::intValue)
						.sum();
		System.out.println(sum);

	}

}
