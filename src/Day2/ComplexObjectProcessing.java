package Day2;

import java.util.Arrays;
import java.util.List;

public class ComplexObjectProcessing {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 18),
			    new Person("Charlie", 30),
			    new Person("Diana", 22)
			);

		Double average=people.stream().filter(a->a.getAge()>20).mapToInt(Person::getAge).average().orElse(0);
		System.out.println(average);
	}

}
class Person {
    String name;
    int age;
    // constructor, getters
    public Person(String name, int age) {
    	this.name=name;
    	this.age=age;
    }
    public String getName() {
    	return this.name;
    }
    public int getAge() {
    	return this.age;
    }
}