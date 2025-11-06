package Day1;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class firstStringWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "owl");
		Optional<String> string=words.stream().filter(s->s.length()>5).findFirst();
		string.ifPresent(System.out::println);
	}

}
