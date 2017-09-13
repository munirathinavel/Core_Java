package fresh;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

		
		treeMap.put(1, 10);
		treeMap.put(2, 20);
		treeMap.put(3, 30);
//		treeMap.put(4, null);
		treeMap.put(2, 2000);
		treeMap.put(3, 3000);

		System.out.println(treeMap);
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(0);
		treeSet.add(3);
		treeSet.add(3);
//		treeSet.add(null);
		System.out.println(treeSet);
	}

}
