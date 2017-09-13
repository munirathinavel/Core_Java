package javatpoint.collections.arraylist;

import java.util.*;

public class CollectionsExample {
	public static void main(String a[]) {
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Core Java");
		list.add("Advance Java");

		System.out.println("Initial collection value:" + list);

		Collections.addAll(list, "Servlet", "JSP", "Servlet", "JSP");

		System.out.println("After adding elements collection value:" + list);

		String[] strArr = { "C#", ".Net" };
		Collections.addAll(list, strArr);
		System.out.println("After adding array collection value:" + list);
		// Collections.singleton(list);

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(46);
		list1.add(67);
		list1.add(24);
		list1.add(16);
		list1.add(8);
		list1.add(12);
		System.out.println("Value of maximum element from the collection: " + Collections.max(list1));
		System.out.println("Value of minimum element from the collection: " + Collections.min(list1));

		Map<String, String> map1 = Collections.EMPTY_MAP;
		List<String> list11 = Collections.EMPTY_LIST;
		Set<String> set11 = Collections.EMPTY_SET;

		Collections.emptySet();
		List<List<Integer>> lists = Collections.nCopies(5, list1);
		for (List<Integer> list2 : lists) {
			System.out.println("\nStarting to print List");
			for (Integer integer : list2) {
				System.out.print(integer + " ");
			}
		}

		Collections.reverse(list1);
		System.out.println("After reversing the list");
		System.out.println(list1);

		List unmodifiableList = Collections.unmodifiableList(list1);
		// unmodifiableList.add(232); // Not supported on unmodifiable List
		System.out.println("After adding 232 in unmodfiable list");
		System.out.println(unmodifiableList);

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("mukesh"); // lower case acsii value is more than upper case
		al.add("Tahir");

		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList al1 = new ArrayList();
		al1.add(Integer.valueOf(201));
		al1.add(Integer.valueOf(101));
		al1.add(230);// internally will be converted into objects as
					// Integer.valueOf(230)

		Collections.sort(al1);

		itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
