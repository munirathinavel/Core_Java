package javatpoint.oops.staticEx;

class CollegeStudent {

	int rollNo;
	String name;
	static String college = "AMS";

	public CollegeStudent(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public String toString() {
		return "rollNo=" + this.rollNo + ", name=" + this.name + ", College=" + this.college;

	}

}

public class StaticExample {
	static int a = 212;

	public static void main(String[] args) {

		System.out.println(StaticExample.a);
		// Object /Instance
		CollegeStudent gomathi = new CollegeStudent(1001, "Gomathi");
		System.out.println(gomathi);

		CollegeStudent poovizhi = new CollegeStudent(1002, "Poovizhi");
		System.out.println(poovizhi);

		String.valueOf(false); // Static Method

		StaticExample.m1(); // Static Method

	}

	// Static Method
	static void m1() {

	}

}
