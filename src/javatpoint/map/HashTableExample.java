package javatpoint.map;

import java.util.*;

class HashTableExample {
	public static void main(String args[]) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		// It wont accept null key or value.
		// hm.put(null, "Rahul");
		// hm.put(103, null);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}