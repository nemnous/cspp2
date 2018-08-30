/**
 * author: @nemnous.
 * Date: 30 Aug 2018
 * concatination of strings
 */
import java.util.Scanner;
/**
 * Class for concatinate.
 */
public final class Concatinate {
    /**
     * Constructs the object.
     */
    private Concatinate() {
        /**
         * unused constructor.
         */
    }
    /**
     * main function.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        System.out.println("Enter name:");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println("Hello ".concat(name).concat(" !"));
    }
}
