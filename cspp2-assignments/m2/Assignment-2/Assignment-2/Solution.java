/**
 * author: @nemnous.
 * Date: 28th Aug 18.
 * Roots of Quadratic expression
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**
		 * does nothing.
		 */
	}
	/**
	 * main function.
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	static void rootsOfQuadraticEquation(int a, int b, int c) {
		double t = b * b - (4 * a * c);
		double root1 = (-b + Math.sqrt(t))/(2 * a);
		double root2 = (-b - Math.sqrt(t))/(2 * a);
		System.out.println(root1 + " " + root2);


	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}
