package javatpoint.oops.thisEx;

class Student001 {
	int rollno;
	String name;
	float fee;

	Student001(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis1 {
	public static void main(String args[]) {
		Student001 s1 = new Student001(111, "ankit", 5000f);
		Student001 s2 = new Student001(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
