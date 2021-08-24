package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("one", 1);
		hashmap.put("Two", 2);
		hashmap.put("Three", 3);

		Set<Map.Entry<String, Integer>> i = hashmap.entrySet();
		for (Entry<String, Integer> e : i) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}

	}

}
