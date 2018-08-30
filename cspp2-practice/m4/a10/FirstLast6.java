/**
 * author: @nemnous.
 * Date: 30 Aug 2018
 * Return True if six appears in first or last of array
 */
import java.util.Scanner;
/**
 * Class for first last six.
 */

public final class FirstLast6 {
    /**
     * Constructs the object.
     */
    private FirstLast6() {
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
        System.out.print("Enter number of element in an array:");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = inp.nextInt();
        }
        final int six = 6;
        System.out.println((arr[0] == six || arr[number - 1] == six));

    }
}
