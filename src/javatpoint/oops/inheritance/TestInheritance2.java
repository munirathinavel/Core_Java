package javatpoint.oops.inheritance;

class Puppy extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

class TestInheritance2 {
	public static void main(String args[]) {
		Puppy puppyKuttima = new Puppy();
		
		puppyKuttima.weep();
		puppyKuttima.bark();
		puppyKuttima.eat();
	}
}