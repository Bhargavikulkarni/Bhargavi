package CaseStudy;

import java.util.Comparator;

public class SortByCharacter implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.scharacter.compareTo(o2.scharacter);
	}
}
