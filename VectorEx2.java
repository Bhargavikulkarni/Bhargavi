package Assignment;

import java.util.*;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Integer> integer = new Vector<>();
		integer.add(100);
		integer.add(200);
		integer.add(300);
		integer.add(200);
		integer.add(400);
		integer.add(500);
		integer.add(600);
		integer.add(700);
		System.out.println("Values in vector: " + integer);
		System.out.println("Remove first occourence of element 200: " + integer.remove((Integer) 200));
		System.out.println("Values in vector: " + integer);
		System.out.println("Remove element at index 4: " + integer.remove(4));
		System.out.println("New Value list in vector: " + integer);
		integer.removeElementAt(5);
		System.out.println("Vector element after removal: " + integer);
		System.out.println("Hash code of this vector = " + integer.hashCode());
		System.out.println("Element at index 1 is = " + integer.get(1));
	}
}
