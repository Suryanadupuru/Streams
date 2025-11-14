package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollector {

	// Create a custom collector that finds the second largest number in a stream.
	public static void main(String[] args) {
		
		
		Collector<Integer, ?, Integer> secondHighest=Collector.of(
				()->new int[] {Integer.MIN_VALUE,Integer.MIN_VALUE},
				(result,num)->{
					if(num>result[0]) {
						result[1]=result[0];
						result[0]=num;
					}else if(num<result[0]&& num>result[1]) {
						result[1]=num;
					}
				},
				(stream1,stream2)->{
					int[] merged=new int[] {stream1[0],stream1[1]};
					if(stream2[0]>merged[0]) {
						merged[1]=Math.max(merged[0], stream2[1]);
						merged[0]=stream2[0];
					}else if(stream2[0]<merged[0]&&stream2[0]>merged[1]) {
						merged[1]=stream2[0];
					}
					return merged;
				}
				,result ->result[1]!=Integer.MIN_VALUE?result[1]:null
			);
				
		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 20);	
		int secondLargerst=numbers.stream().collect(secondHighest);
		System.out.println(secondLargerst);
		
	}
}
