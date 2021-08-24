package Assignment;

import java.util.Scanner;
import java.io.*;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Bhargavi\\Desktop\\Agiliztech\\Example.txt")) {
			String text = " This is try with resource";
			byte arr[] = text.getBytes();
			fos.write(arr);
			System.out.println("Message written to file Successfully.....");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
