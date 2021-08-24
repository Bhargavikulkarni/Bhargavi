package Assignment;

import java.util.*;

public class TreeMapEx {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Aishwarya");
		map.put(102, "Bhargavi");
		map.put(101, "Vinay");
		map.put(103, "Nihal");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
