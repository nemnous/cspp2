/**
 * author: @nemnous.
 * Date: 03 Sep 2018
 * Student Details
 */
/**
 * Class for student.
 */
class Student {
	private String name, id;
	private double m1, m2, m3;
	/**
	 * Constructs the object.
	 * @param      name    The name
	 * @param      id      The identifier
	 * @param      marks1  The marks 1
	 * @param      marks2  The marks 2
	 * @param      marks3  The marks 3
	 */
	private Student(String name1, String id1, final double marks1, final double marks2, final double marks3) {
		name = name1;
		id = id1;
		m1 = marks1;
		m2 = marks2;
		m3 = marks3;
	}
	/**
	 * main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Student std1 = new Student(args[0], args[1], Double.parseDouble(args[2]),
			Double.parseDouble(args[3]), Double.parseDouble(args[4]));
		// System.out.println((args[2]+args[3]+arg[4])/3);
		System.out.println((std1.m1 + std1.m2 + std1.m3)/3);

	}
}

