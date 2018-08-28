/**
    * author: @nemnous.
    * Date: 27 Aug 2018
    * Degrees to Fahreinheit conversion
*/
import java.util.Scanner;
/**
    * this is main class.
*/

public final class DegreesToFahrenheit {
    /**
        * this is private constructor.
    */
    private DegreesToFahrenheit() {

    }
    /**
        * @param args is an argument.
    */
    public static void main(final String[] args) {
        System.out.println("Enter temperature in celsius:");
        Scanner inp = new Scanner(System.in);
        float celsius = inp.nextFloat();
        final double t1 = 1.8;
        final float t2 = 32;
        System.out.println(celsius * t1 + t2);
    }
}
