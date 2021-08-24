package Assignment;

import java.util.*;

class LinkedHashMapEx {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();

		hashmap.put(100, "Aishwarya");
		hashmap.put(101, "Vinay");
		hashmap.put(102, "Nihal");

		for (Map.Entry entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
