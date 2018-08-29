/**
 * author: @nemnous.
 * Date: 29 Aug 2018
 * Sum of n natural numbers
 */
import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
public final class SumOfNNumbers {
    /**
     * Constructs the object.
     */
    private SumOfNNumbers() {
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
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {

            sum += i;
        }
        System.out.println(sum);
    }
}
