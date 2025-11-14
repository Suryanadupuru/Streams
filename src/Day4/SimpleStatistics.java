package Day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		DoubleSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingDouble(num->num));
		System.out.println(statistics);
	}

}
