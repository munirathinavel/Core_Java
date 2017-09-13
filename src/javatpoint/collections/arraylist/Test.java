package javatpoint.collections.arraylist;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("db.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

		Properties properties = System.getProperties();

		System.out.println("Printing values with Meothd:1");
		Set<Entry<Object, Object>> propertyEntrySet = properties.entrySet();
		for (Entry<Object, Object> propEntry : propertyEntrySet) {
			System.out.println("Key=" + propEntry.getKey() + "|| Value=" + propEntry.getValue());
		}

		System.out.println("Printing values with Meothd:2");
		Iterator iterator = propertyEntrySet.iterator();
		for (Entry<Object, Object> entry : propertyEntrySet) {
			System.out.println("Key=" + entry.getKey() + "|| Value=" + entry.getValue());
		}
		System.out.println("Printing values with Meothd:3");
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println("Key=" + entry.getKey() + "|| Value=" + entry.getValue());
		}

		Properties p1 = new Properties();
		p1.setProperty("name", "Sonoo Jaiswal");
		p1.setProperty("email", "sonoojaiswal@javatpoint.com");

		p1.store(new FileWriter("info.properties"), "Javatpoint Properties Example");

	}

}