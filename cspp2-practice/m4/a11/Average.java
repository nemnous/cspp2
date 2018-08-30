/**
 * author: @nemnous.
 * Date: 29 Aug 2018
 * Average of elements in an array
 */
import java.util.Scanner;
/**
 * Class for average.
 */
public final class Average {
    /**
     * Constructs the object.
     */
    private Average() {
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
        System.out.println("Enter number of elements in array:");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int[] arr = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            arr[i] = inp.nextInt();
            sum += arr[i];
        }
        System.out.println(sum / number);

    }
}
