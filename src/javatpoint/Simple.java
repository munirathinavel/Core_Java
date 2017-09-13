package javatpoint;

class Simple {
	public static void main(String[] args) {
		int a = 10;
		float f = a;
		System.out.println(a);
		System.out.println(f);

		f = 10.5f;
		// int a=f;//Compile time error
		a = (int) f;
		System.out.println(f);
		System.out.println(a);
		
		a=130;  
		byte b=(byte)a;  
		System.out.println(a);  
		System.out.println(b);

	}
}