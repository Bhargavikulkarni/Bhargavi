package Assignment;

import java.util.*;

public class TreeMapEx {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "Aishwarya");
		map.put(2, "Bhargavi");
		map.put(3, "Vinay");
		map.put(4, "Nihal");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
