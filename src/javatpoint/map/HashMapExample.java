package javatpoint.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
} 
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(100, "ram");
		hashMap.put(23, "san");
		hashMap.put(23433, "vel");
		hashMap.put(2, "raj");
		hashMap.put(2, "rajakumaran");
		
		HashMap<Integer, String> newMap = (HashMap<Integer, String>) hashMap.clone();
		System.out.println(hashMap.get(23433));
		
		newMap.put(23433, "Munirathinavel");
		System.out.println(hashMap.get(23433));
		// This will take one null
		// hashMap.put(null, "nullvalue-1");
		// hashMap.put(null, "nullvalue-2");
		System.out.println("HashMap Iteration through For-Each Entry Set:");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key=" + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("HashMap Iteration through Entry Set:");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator1 = entrySet.iterator();
		while (iterator1.hasNext()) {
			Entry<Integer, String> entry = iterator1.next();
			System.out.println("Key=" + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("HashMap Iteration through For-Each Key Set:");
		for (Integer key : hashMap.keySet()) {
			System.out.println("Key=" + key + ", Value = " + hashMap.get(key));
		}

		System.out.println("HashMap Iteration through Key Set:");
		Set<Integer> set = hashMap.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			int key = (int) iterator.next();
			System.out.println("Key=" + key + ", Value = " + hashMap.get(key));
		}
	}
}
