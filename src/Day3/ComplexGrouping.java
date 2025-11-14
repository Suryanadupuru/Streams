package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComplexGrouping {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "IT", 75000),
			    new Employee("Bob", "HR", 45000),
			    new Employee("Charlie", "IT", 90000),
			    new Employee("Diana", "HR", 55000),
			    new Employee("Eve", "IT", 82000));
		
		Map<String, Map<String, List<Employee>>> result = employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.groupingBy(employee -> {
							if(employee.getSalary() <5000) return "LOW";
							else if (employee.getSalary() <=80000) return "MEDIUM";
							else return "HIGH";
							})
						));
	
		System.out.println(result);
	}
}

class Employee{
	private String name;
	private String department;
	private double salary;
	
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name;
	}
	
}