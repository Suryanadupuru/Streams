package Day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFilter {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(15, 23, 8, 42, 4, 16, 31, 7, 19, 50);
		// Find all prime numbers from the list
		// Expected: [23, 31, 7, 19]
		List<Integer> primeNumbers=numbers.stream().filter(PrimeFilter::isPrime).collect(Collectors.toList());
		System.out.println(primeNumbers);
	}
	
	private static boolean isPrime(int num) {
		if(num<=1)return false;
		if(num<=3)return true;
		if(num%2==0 || num%3 ==0)return false;
		for(int i=5;i*i<num;i+=6) {
			if(num%i==0 || num%i+2==0)return false;
		}
		return true;
	}
}
