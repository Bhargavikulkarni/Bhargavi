package Assignment;

import java.util.Scanner;

public class CountingVowConsSpaces {

	public static void main(String[] args) {
		String Sentence;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		Sentence = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

		Sentence = Sentence.toLowerCase();
		for (int i = 0; i < Sentence.length(); ++i) {
			char ch = Sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if (ch >= '0' && ch <= '9') {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);

	}

}
