package javatpoint.oops.staticEx;

class StaticMethod {
	int rollno;
	String name;
	static String college = "IMS";

	static void change() {
		college = "AMS";
	}

	StaticMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {

		StaticMethod s1 = new StaticMethod(111, "Gomathi");
		StaticMethod s2 = new StaticMethod(222, "Poovizhi");
		StaticMethod s3 = new StaticMethod(333, "Sangeetha");

		s1.display();
		s2.display();
		s3.display();

		StaticMethod.change();

		s1.display();
		s2.display();
		s3.display();
	}
}