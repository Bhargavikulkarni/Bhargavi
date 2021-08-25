package CaseStudy;

public class Student implements Comparable<Student> {

	int student_id;
	String student_name;
	int student_age;
	int student_marks;
	static String student_College_name = "BIT";

	public Student(int student_id, String student_name, int student_age, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_marks = student_marks;
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

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public int getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}

	public static String getStudent_College_name() {
		return student_College_name;
	}

	public static void setStudent_College_name(String student_College_name) {
		Student.student_College_name = student_College_name;
	}

	/*
	 * @Override public String toString() { return "Student [student_id=" +
	 * student_id + ", student_name=" + student_name + ", student_age=" +
	 * student_age + ", student_marks=" + student_marks + "]"; }
	 */
	@Override
	public int compareTo(Student o) {
		return this.student_id - o.student_id;
		// return o.student_id - this.student_id; 
	
}
	public int compareTo1(Student o1) {
		return this.student_age - o1.student_age;
		// return o.student_id - this.student_id; 
	}
}
