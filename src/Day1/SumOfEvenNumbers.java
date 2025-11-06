package Day1;
import java.util.*;


public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum=numbers.stream().filter(num->num%2==0).reduce(0, (num1,num2)->num1+num2);
		System.out.println(sum);
		int sum2=numbers.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
	}

}
