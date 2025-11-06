package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLengthAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "dogs", "elephant", "bird", "lion", "tiger");
		Map<Integer, Long> stringCount=words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(stringCount);
	}

}
