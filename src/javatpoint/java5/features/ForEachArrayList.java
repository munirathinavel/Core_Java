package javatpoint.java5.features;

import java.util.ArrayList;

public class ForEachArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ram");
		list.add("manju");
		list.add("sri");

		for (String str : list) {
			System.out.println(str);
		}
	}
}
