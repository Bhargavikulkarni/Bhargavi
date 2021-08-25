package CaseStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice, n = 0;
		while (true) {
			System.out.println("01. Sort By ID");
			System.out.println("02.Sort By Character ");
			System.out.println("03.Sort By Name ");
			System.out.println("04. Exit");

			System.out.print("Enter Your Choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Sorting By Id.....");
				ArrayList<Student> studentarraylist = new ArrayList<Student>();
				studentarraylist.add(new Student(1, "Sam", 25, 72));
				studentarraylist.add(new Student(3, "Jack", 22, 78));
				studentarraylist.add(new Student(2, "Alexa", 28, 90));
				studentarraylist.add(new Student(5, "Kevin", 26, 56));
				studentarraylist.add(new Student(4, "Max", 23, 76));
				Collections.sort(studentarraylist);
				for (Student studentbyid : studentarraylist) {
					System.out.print(studentbyid.getStudent_id() + "\t" + " ");
					System.out.print(studentbyid.getStudent_name() + "\t" + " ");

					System.out.print(studentbyid.getStudent_age() + "\t" + " ");

					System.out.print(studentbyid.getStudent_marks() + "\t" + "\n ");
				}
				break;

			case 2:
				System.out.println("Sorting By Student Character");
				TreeSet<Student1> treeset = new TreeSet<Student1>(new SortByCharacter());
				// ArrayList<Student1> arrayliststudent = new ArrayList<Student1>((Collection<?
				// extends Student1>) new SortByCharacter());
				treeset.add(new Student1(1, "Sam", "Polite"));
				treeset.add(new Student1(3, "Jack", "Silent"));
				treeset.add(new Student1(2, "Alexa", "Dedicated"));
				treeset.add(new Student1(5, "Kevin", "Focused"));
				treeset.add(new Student1(4, "Max", "Smart"));

				for (Student1 student : treeset) {
					System.out.println(student.getStudent_id());
					System.out.println(student.getStudent_name());
					System.out.println(student.getScharacter());
					System.out.println("****************\n****************");

				}
				break;
			case 3:
				System.out.println("Sorting By Student Name");
				TreeSet<Student> treeset1 = new TreeSet<Student>(new SortByName());
				treeset1.add(new Student(1, "Sam", 25, 72));
				treeset1.add(new Student(3, "Jack", 22, 78));
				treeset1.add(new Student(2, "Alexa", 28, 90));
				treeset1.add(new Student(5, "Kevin", 26, 56));
				treeset1.add(new Student(4, "Max", 23, 76));

				for (Student student : treeset1) {
					System.out.println(student.getStudent_id());
					System.out.println(student.getStudent_name());
					System.out.println(student.student_age);
					System.out.println(student.student_marks);
					System.out.println("****************\n****************");

				}
				break;
			case 4:
				if (choice < 4) {
					System.out.println(" Continue......");
				} else {
					System.out.println("Completed successfully...");
				}

				// System.exit(0);
				// System.out.println("Completed successfully...");
			}
		}
	}
}