package javatpoint.oops.thisEx;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int r, String n, float f) {
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis3 {
	public static void main(String args[]) {
		RealConstructor s1 = new RealConstructor(111, "ankit", 5000f);
		RealConstructor s2 = new RealConstructor(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}