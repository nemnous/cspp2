/**
 * author: @nemnous.
 * Date 27 Aug 2018
 * Area of triangle
 */
import java.util.Scanner;
/**
 * this is main function.
 */
public class Solution {
	/**
	 * constructor.
	 */
	private Solution() {
		/**
		 * unused.
		 */
	}
	/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		areaOfTriangle(base, height);
	}
	/**
	 * Area of triangle function.
	 */
	public static void areaOfTriangle(int base, int height) {
		double area = 0.5 * base * height;
		System.out.println(area);
	}
}