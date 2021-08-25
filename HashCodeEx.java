package Assignment;

public class HashCodeEx {
	public static void main(String[] args) {
		String a = "TestYantra";
		String b = "TestYantra";

		if (a.equals(b)) {
			System.out.println("a & b are equal, HashValue is :" + " " + a.hashCode() + " and " + b.hashCode());

		}

		String c = "Agiliztech";
		String d = "Agiliz";

		if (!c.equals(d)) {
			System.out.println("a & b are not equal, HashValue is :" + " " + c.hashCode() + " and " + d.hashCode());

		}
	}
}
