/**
 * author: @nemnous.
 * Date: 29 Aug 2018
 * Program to find number of 7's in range of n.
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
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int t = i;
            final int ten = 10;
            final int seven = 7;
            while (t != 0) {
                int rem = t % ten;
                if (rem == seven) {
                    count++;
                }
                t /= ten;
                }
            }
        // for (int i = 1; i <= n; i++) {
        //     String.valueOf(i)
        // }
        System.out.println(count);
    }
}
