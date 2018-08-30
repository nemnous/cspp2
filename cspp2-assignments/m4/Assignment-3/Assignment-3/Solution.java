/**
 * author: @nemnous.
 * Date 30 Aug 2018
 * Binary to decimal
 */

import java.util.Scanner;
/**
 * class Solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * unused constructor.
         */
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            // System.out.println(s);
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     * binary to decimal function.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static String binaryToDecimal(final String s) {
        int base = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum = sum + (base * Character.getNumericValue(s.charAt(i)));
            base *= 2;
        }

        return Integer.toString(sum);
    }


}
