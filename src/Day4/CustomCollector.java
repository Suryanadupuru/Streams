package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollector {

	public static void main(String[] args) {
		
		Collector<Integer, int[], Integer> productOfnumbers =Collector.of(
				()->new int[] {1},
				(prod,num)->prod[0]*=num,
				(prod1,prod2)->{prod1[0]*=prod2[0];
					return prod1;},
				prod -> prod[0]);
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		Integer collect = numbers.stream().collect(productOfnumbers);
		System.out.println(collect);
	}

}
