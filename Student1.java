package CaseStudy;

public class Student1 implements Comparable<Student1> {
	int student_id;
	String student_name;
	String scharacter;

	public Student1(int student_id, String student_name, String scharacter) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.scharacter = scharacter;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getScharacter() {
		return scharacter;
	}

	public void setScharacter(String scharacter) {
		this.scharacter = scharacter;
	}

	@Override
	public int compareTo(Student1 o) {
		return this.student_id - o.student_id;

	}
	/*
	 * @Override public String toString() { return "Student1 [student_id=" +
	 * student_id + ", student_name=" + student_name + ", scharacter=" + scharacter
	 * + "]"; }
	 */

}
