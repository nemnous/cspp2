/**
 * author: @nemnous.
 * Date: 28 Aug 18
 * Factorial using recurssion.
 */
import java.util.Scanner;
/**
 * Class for factorial.
 */
public final class Factorial {
    /**
     * Constructs the object.
     */
    private Factorial() {
        /**
         * does nothing.
         */
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println(factorial(num));
    }
    /**
     * { function_description }.
     *
     * @param      num   The number
     *
     * @return     { description_of_the_return_value }
     */
    static int factorial(final int num) {
        if (num == 1) {
            return 1;
        }
        return (num * factorial(num - 1));
    }
}
