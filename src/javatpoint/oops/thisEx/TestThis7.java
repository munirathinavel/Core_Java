package javatpoint.oops.thisEx;

class RealConstructor {
	int rollno;
	String name, course;
	float fee;

	RealConstructor(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	RealConstructor(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis7 {
	public static void main(String args[]) {
		RealConstructor s1 = new RealConstructor(111, "ankit", "java");
		RealConstructor s2 = new RealConstructor(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}