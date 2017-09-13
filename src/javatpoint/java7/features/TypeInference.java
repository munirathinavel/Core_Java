package javatpoint.java7.features;

import java.util.ArrayList;
import java.util.List;

class GenericClass<T> {
	
	public <T> GenericClass(T t) {
		System.out.println(t);
	}
}

public class TypeInference {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(222);
		list1.add(333);
		System.out.println(list1);

		GenericClass<Integer> genericClass = new GenericClass<>(123);
		
		
	}
}
