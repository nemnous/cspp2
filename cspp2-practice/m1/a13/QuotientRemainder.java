/**
    * author: @nemnous.
    * Date: 27 8 18
    * Quotient and Remainder of two numbers
*/
import java.util.Scanner;
/**
    * main class.
*/
public final class QuotientRemainder {
    /**
    * unused constructor.
    */
    private QuotientRemainder() {

    }

    /**
        * @param args is an argument
    */

    public static void main(final String[] args) {
        System.out.println("Enter a and b:");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("quotient is:" + a / b);
        System.out.println("remainder is:" + a % b);
    }
}
