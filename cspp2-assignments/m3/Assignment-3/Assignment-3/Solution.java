/**
 * author: @nemnous.
 * Date: 29Aug2018
 * GCD of two numbers
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
         * does nothing.
         */
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println(gcd);
    }
    /**
     * gcd function.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     returns gcd
     */
    static int gcd(final int n1, final int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    /*
    Need to write the gcd function and print the output.
    */
}
