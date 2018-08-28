/**
 * author: @nemnous.
 * Date 28 Aug 18
 * Comparing varA and varB
 */
import java.util.Scanner;
/**
 * Class for bigger equal smaller.
 */
public final class BiggerEqualSmaller {
    /**
     * Constructs the object.
     */
    private BiggerEqualSmaller() {
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
        int varA = inp.nextInt();
        int varB = inp.nextInt();
        if (varA > varB) {
            System.out.println("Bigger");
        } else if (varA < varB) {
            System.out.println("Smaller");
        } else {
            System.out.println("Equal");
        }
    }
}
