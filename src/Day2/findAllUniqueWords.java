package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findAllUniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sentences = Arrays.asList(
			    "Java streams are powerful",
			    "Streams make code readable",
			    "java streams help functional programming"
			);
		Stream<String> flatStream=sentences.stream().flatMap(s->Arrays.stream(s.split(" ")));
		List<String> uniqueWordsList=flatStream.map(String::toLowerCase).distinct().collect(Collectors.toList());
		System.out.println(uniqueWordsList);
	}

}
