package javatpoint.java5.features;

import java.util.ArrayList;
import java.util.List;

class Animal {
	void eatSomething() {
		System.out.println("Eatinng something..");
	}
}

class Dog extends Animal {
	@Override // Compiler error if wrong (mismatch in) method call
	void eatSomething() {
		System.out.println("Eating bones..");
	}

	@Deprecated
	void eatFish() {
		System.out.println("Eating Fish peacefully..");
	}
}

@SuppressWarnings(value = { "unchecked" })
public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Dog jhonny = new Dog();
		jhonny.eatSomething();

		List list = new ArrayList();

		list.add("2323");
		list.add("23423");
		list.add("sdfds");

		for (Object obj : list) {
			System.out.println(obj);
		}

		jhonny.eatFish();
	}
}
