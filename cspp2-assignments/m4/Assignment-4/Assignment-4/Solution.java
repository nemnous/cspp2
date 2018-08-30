/**
 * author: @nemnous.
 * Date: 30 Aug 2018
 * Reverse of a string
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
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * REVERSE STRING.
     *
     * @param      s     s is a string.
     *
     * @return     returns reverse of a string s.
     */
    static String reverseString(final String s) {
        String str1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str1 += s.charAt(i);
        }
        return str1;
    }
}
