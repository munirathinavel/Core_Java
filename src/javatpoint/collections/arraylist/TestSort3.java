package javatpoint.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class Student5 implements Comparable<Student5> {
	int rollno;
	String name;
	int age;

	Student5(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student5 st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class TestSort3 {
	public static void main(String args[]) {
		ArrayList<Student5> al = new ArrayList<Student5>();
		al.add(new Student5(101, "Vijay", 23));
		al.add(new Student5(106, "Ajay", 27));
		al.add(new Student5(105, "Jai", 21));

		Collections.sort(al);
		for (Student5 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}