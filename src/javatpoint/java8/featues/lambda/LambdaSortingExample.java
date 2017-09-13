package javatpoint.java8.featues.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	int age;
	int grade;

	Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

public class LambdaSortingExample {

	private static final int PASS_THRESHOLD = 50;

	public static void main(String[] args) {

		// Creating List of Students
		Student s1 = new Student("Vel", 28, 78); // o1
		Student s2 = new Student("Gomathi", 23, 67); // o2
		Student s3 = new Student("Manju", 31, 98);
		Student s4 = new Student("Poovi", 9, 45);
		Student s5 = new Student("Gugan", 3, 34);

		List<Student> studentList = new ArrayList<>();

		// Adding Students to the Student List
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		// Sorting Student's based on Age
		Collections.sort(studentList, (o1, o2) -> {
			if (o1.age > o2.age) {
				return 1;
			} else if (o1.age < o2.age) {
				return -1;
			}
			return 0;
		});

		// Printing All students
		System.out.println("Printing Student List after sorting with Age: \n");
		studentList.forEach((student) -> System.out.println("Name=" + student.name + ", Age=" + student.age));

		// Filtering Student with Age less than 25
		Stream<Student> filteredStudentList = studentList.stream().filter(student -> student.age < 25);

		// Printing All students
		System.out.println("\nPrinting Student List after filtering with Age: \n");
		filteredStudentList.forEach((student) -> System.out.println("Name=" + student.name + ", Age=" + student.age));

		// Partition students into passing and failing
		Map<Boolean, List<Student>> passingFailing = studentList.stream()
				.collect(Collectors.partitioningBy(s -> s.grade >= PASS_THRESHOLD));

		passingFailing.forEach((Boolean key, List<Student> value) -> {
			System.out.println("\nStudent Result:" + key);
			value.forEach((student) -> System.out.println("name:" + student.name + ", grade=" + student.grade));
		});

	}
}
