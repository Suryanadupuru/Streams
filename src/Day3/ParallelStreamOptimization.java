package Day3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamOptimization {

	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1, 1000000).boxed().collect(Collectors.toList());
		long startTime = System.currentTimeMillis();
		List<Integer> primeSequential = numbers.stream().filter(ParallelStreamOptimization::isPrime).collect(Collectors.toList());
		long sequentialTime = System.currentTimeMillis()-startTime;
		
		startTime=System.currentTimeMillis();
		List<Integer> primeParallel = numbers.parallelStream().filter(ParallelStreamOptimization::isPrime).collect(Collectors.toList());
		long parallelTime=System.currentTimeMillis()-startTime;
		
		
		System.out.println("Sequential Time "+ sequentialTime + " ms");
		System.out.println("Parallel time "+ parallelTime + " ms");
		
		
	}
	
	static boolean isPrime(int num) {
		if (num<=1) return false;
		if (num<=3) return true;
		if (num%2==0 || num%3==0) return false;
		for (int i=5; i<=Math.sqrt(num);i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}
