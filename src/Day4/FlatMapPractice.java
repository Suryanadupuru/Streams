package Day4;

import java.util.Arrays;
import java.util.List;

public class FlatMapPractice {

	public static void main(String[] args) {
		List<List<Integer>> numberLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		
		int sum=numberLists.stream()
				.flatMap(a->a.stream())
				.reduce(0,(a,b)->a+b);
		
		System.out.println(sum);
		
		int sum1 = numberLists.stream()
			    .flatMap(List::stream)
			    .mapToInt(Integer::intValue)
			    .sum();
	}

}
