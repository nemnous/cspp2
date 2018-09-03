/**
 * author: @nemnous.
 * Date: 03 Sep 2018
 * Input validator
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * private String.
     */
    private String str1;
    /**
     * Constructs the object.
     *
     * @param      str   The string
     */
    InputValidator(final String str) {
        str1 = str;
    }
    /**
     * validate data.
     *
     * @return     { description_of_the_return_value }
     */
    boolean validateData() {
        final int six = 6;
        return (str1.length() >= six);
    }
}
/**
 * Class for solution.
 */
final public class Solution {
    /**
     * Solution.
     */
    private Solution() {
        /**
         * unused constructor.
         */
    }
    /**
     * main func.
     * @param args is argument.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
