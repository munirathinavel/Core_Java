package javatpoint.collections.arraylist;

import java.util.*;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class TestCollection3 {
	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s1);
		al2.add(s2);

		al.addAll(al2);// adding second list in first list

		// Getting Iterator
		Iterator<Student> itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		al.removeAll(al2); 
		
		for (Student st : al2) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}