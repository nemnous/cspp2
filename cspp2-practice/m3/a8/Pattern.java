/**
 * author: @nemnous.
 * Date: 29 08 18
 * Pattern:
 * 1
 * 1 2
 * 1 2 3
 */
import java.util.Scanner;
/**
 * Class for pattern.
 */
public final class Pattern {
    /**
     * Constructs the object.
     */
    private Pattern() {
        /**
         * unused construtor.
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
    for (int i = 1; i <= number; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}