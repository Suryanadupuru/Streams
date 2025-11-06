package Day1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringToLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
		List<Integer> length=words.stream().map(String::length).collect(Collectors.toList());
		Iterator<Integer> iterator = length.iterator();
		while(iterator.hasNext()) {
			System.out.println( iterator.next());
		}
	}

}