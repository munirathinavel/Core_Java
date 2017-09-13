package javatpoint.java5.features;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx1 {

	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);// typecasting
		System.out.println(s);

		List<String> list1 = new ArrayList<String>();
		list1.add("generic hello");
		String s1 = list1.get(0);
		System.out.println(s1);
		// list1.add(32);//Compile Time Error

	}

}
