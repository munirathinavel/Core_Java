package javatpoint.java5.features.generics;

/**
 * 
 * @author munirathinavel
 *
 * @param <T1>
 * @param <T2>
 */
interface IGenericInterface<T1, T2> {
	void addTwoValues(T1 t1, T2 t2);
}

class SubClass1<T1, T2> implements IGenericInterface<T1, T2> {
	public void addTwoValues(T1 t1, T2 t2) {
		if (t1 instanceof Integer && t2 instanceof Integer) {
			System.out.println((int) t1 + (int) t2);
		} else if (t1 instanceof Float && t2 instanceof Float) {
			System.out.println((float) t1 + (float) t2);
		} else if (t1 instanceof String && t2 instanceof String) {
			System.out.println(t1 + " & " + t2);
		}
	}
}

public class GenericInterface {

	public static void main(String[] args) {
		IGenericInterface<Integer, Integer> classInteger = new SubClass1<Integer, Integer>();
		classInteger.addTwoValues(123, 3234);
		IGenericInterface<Float, Float> classFloat = new SubClass1<Float, Float>();
		classFloat.addTwoValues(13f, 3234f);
		IGenericInterface<String, String> classString = new SubClass1<String, String>();
		classString.addTwoValues("Cool", "Buddy!");
	}
}
