/**.
    * author: @nemnous.
    * Date: 27 Aug 18.
    * Swapping two numbers.
*/
import java.util.Scanner;

/**
    *class swap.
*/
public final class Swap {
    /**
        * private constructor.
    */
    private Swap() {
    }
    /**
        * This is main.
        * @param args is arguments
    */
    public static void main(final String[] args) {
            System.out.println("Enter a and b:");
            Scanner inp = new Scanner(System.in);
            int a = inp.nextInt();
            int b = inp.nextInt();
            int t = a;
            a = b;
            b = t;
            System.out.println(a + "," + b);
        }
    }
