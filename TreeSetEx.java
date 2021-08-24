package Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Vinay");
		treeset.add("Aishwarya");
		treeset.add("Bhargavi");
		treeset.add("Nihal");
		Iterator i = treeset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
