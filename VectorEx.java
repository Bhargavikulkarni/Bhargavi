package Assignment;

import java.util.*;

public class VectorEx {
	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		vector.add("100");
		vector.add("200");
		vector.add("200");
		vector.add("300");
		vector.addElement("300");
		vector.addElement("500");
		vector.addElement("500");

		System.out.println("Elements are: " + vector);
	}

}
