package fresh.staticExample;

public class StaticExample {

	static int i;

	static class  C1 {
		int i =10;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		i=10;
		System.out.println(i);
		i=20;
		System.out.println(i);
		i=30;
		System.out.println(i);
		
		StaticExample example = new StaticExample();
		example.display();
	}
	
	private void display() {
		System.out.println(StaticExample.i);
		StaticExample.i = 1000;
		System.out.println(StaticExample.i);
	}

}
