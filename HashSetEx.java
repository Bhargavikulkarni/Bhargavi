package Assignment;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		hashset.add(100);
		hashset.add(100);
		hashset.add(200);
		hashset.add(200);
		hashset.add(true);
		hashset.add("Agiliztech");
		hashset.add(null);

		Iterator itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
