package CaseStudy;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	/*@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.student_name.compareTo(o2.student_name);

	}*/

	@Override
	public int compare(Student o1, Student o2) {
		return o1.student_name.compareTo(o2.student_name);
	}

}
