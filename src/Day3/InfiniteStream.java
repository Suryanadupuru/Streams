package Day3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		
		InfiniteStream is=new InfiniteStream();
		System.out.println(is.primes());
		
	}
	
	boolean isPrime(int num) {
		if (num<=1) return false;
		if (num<=3) return true;
		if(num%2==0 || num%3==0) return false;
		for(int i=5; i<=Math.sqrt(num);i+=6) {
			if(num%i==0 || num %(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	List<Integer> primes(){
		List<Integer> primes = Stream.iterate(2, n->n+1)
				.filter(this::isPrime)
				.limit(10)
				.collect(Collectors.toList());
		return primes;
	}

}
