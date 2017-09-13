package javatpoint.java5.features;

public class BinaryLiteralsExample {
	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 0b101;
		System.out.println(i1==i2);
		System.out.println(i1+i2);
		int i3 = -0B01;
		int i4 = 0B100_0;
		System.out.println(i1+i3);
		System.out.println(i4);

	}
}