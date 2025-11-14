package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ObjectProcessing {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			    new Student("Alice", 85),
			    new Student("Bob", 92),
			    new Student("Charlie", 78),
			    new Student("Diana", 85)
			);

		List<Student> studs=students.stream().filter(stu->stu.getScore()>80).collect(Collectors.toList());
		
		double average=students.stream().mapToInt(Student::getScore).average().orElse(0);
		
		Student student=students.stream().collect(Collectors.maxBy((a,b)->a.getScore()>=b.getScore()?1:-1)).orElse(null);
		
		System.out.println(studs);
		System.out.println(average);
		System.out.println(student);
	}

}
class Student {
    String name;
    int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
   
}