/**
 * author: @nemnous.
 * Date: 28 Aug 2018
 * program to a power b
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		/**
		 * does nothing
		 */
	}
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result=power(base,exponent);
        System.out.println(result);
	}
	static int power(int base, int exponent) {
		int product = 1;
		for(int i = 0; i <exponent; i++) {
			product *= base;
		}
		return product;
	}
	/*
	Need to write the power function and print the output.
	*/
}
