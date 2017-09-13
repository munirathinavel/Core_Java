package javatpoint.java5.features.generics;

/**
 * This is generic class example without enforcement of passing different type
 * 
 */
class GenericClassWithNoType {
	Object t;

	void set(Object t) {
		this.t = t;
	};

	Object get() {
		return t;
	}
}

/**
 * This is generic class example without enforcement of passing different type
 * 
 */
class GenericClassWithType<T> {
	T t;

	void set(T t) {
		this.t = t;
	};

	T get() {
		return t;
	}
}

public class GenericClass {

	public static void main(String[] args) {

		GenericClassWithNoType noType = new GenericClassWithNoType();
		noType.set(123);
		System.out.println(noType.get());
		noType.set("assasa");
		System.out.println(noType); // User can change the same object later.
									// Type casting will through error.
		GenericClassWithType<Integer> withType = new GenericClassWithType<>();
		withType.set(12232);
		System.out.println(withType.get());
		// withType.set("asdasd"); // Will through error as soon as we change
		// the data type.

	}
}
