package javatpoint.java5.features.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundGenerics {

	private static Number sum(List<? extends Number> numbers) {
		double s = 0.0;
		for (Number number : numbers) {
			s += number.doubleValue();
		}
		return s;
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(sum(integers));

		List<Float> floats = Arrays.asList(1f, 2f, 3f, 4f, 335f);

		System.out.println(sum(floats));

		List<String> strings= Arrays.asList("s1","s2","s3");
		//The method sum(List<? extends Number>) in the type UpperBoundGenerics<T> is not applicable for the arguments (List<String>)
		//System.out.println(sum(strings));
	}
}
