/**
 * @author :nemnous.
 * Date: 1 Sep 2018
 * Odd composite numbers
 */
import java.util.Scanner;
/**
 * class Solution.
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        final int nine = 9;
        for (int i = nine; i <= n; i++) {
            int t = 1;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    t = 0;
                    break;
                }
            }
            if (t == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}


