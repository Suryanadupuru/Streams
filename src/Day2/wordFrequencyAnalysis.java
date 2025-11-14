package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordFrequencyAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "stream java stream api java collection stream api";
		Map<String, Long> frequency=Arrays.stream(text.split(" ")).
				collect(Collectors.groupingBy(word->word,Collectors.counting()));
		System.out.println(frequency);
		
		List<Map.Entry<String, Long>> result= frequency.entrySet().stream().
				sorted(Map.Entry.<String,Long>comparingByValue().reversed().
						thenComparing(Map.Entry.comparingByKey())).collect(Collectors.toList());
		
		result.forEach(entry ->System.out.println(entry.getKey()+ "="+ entry.getValue()));
	}

}
