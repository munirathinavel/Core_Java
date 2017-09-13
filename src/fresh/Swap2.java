package fresh;

import java.util.HashMap;
import java.util.Map;

public class Swap2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("5", "6");
		int a = 5, b = 6;
		a = a + b;// a=11,b=6
		b = a - b;// a=11,b=5
		a = a - b;// a=6,b=5
 
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		//while (true) {
			Swap2.displayString(1);
	//	}

	}

	static void displayString(int num) {
		System.out.println(num);
		num++;
		displayString(num);
	}

}

class Test {

	void displayString() {
		String str = "Cool buddy";
		System.out.println(str);
		displayString();
		
	}

}
