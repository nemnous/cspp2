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
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
    }
    static long power(int base, int exponent) {
        long product = 1;
        for(int i = 0; i <exponent; i++) {
            product *= base;
        }
        return product;
    }
    /*
    Need to write the power function and print the output.
    */
}
