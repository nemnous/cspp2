
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.Scanner;
public final class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String sss = sc.next();
		int n = Integer.parseInt(sss);	
		// String sss = sc.next();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.println(s);
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	static String binaryToDecimal(String s) {
		int base = 1;
		int sum = 0;
		for(int i = s.length() - 1; i >= 0 ; i--) {
			sum = sum + (base * Character.getNumericValue(s.charAt(i)));
			base *= 2;
		}

		return Integer.toString(sum);
	}


}
