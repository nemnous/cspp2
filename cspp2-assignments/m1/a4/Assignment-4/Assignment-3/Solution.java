/**
 * author: @nemnous.
 * Date: 27 aug 2018.
 * Degrees to fahreinheit.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * does nothing.
         */
    }
    /**
     *main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        double degreesCelsius = scan.nextDouble();
        calculateFromDegreesToFarenheit(degreesCelsius);
    }
    /**
     * Calculates the from degrees to farenheit.
     *
     * @param      degreesCelsius  The degrees celsius
     */
    static void calculateFromDegreesToFarenheit(final double degreesCelsius) {
        final double t1 = 1.8;
        final float t2 = 32;
        double degreesfahreinheit = t1 * degreesCelsius + t2;
        System.out.println(degreesfahreinheit);
    }
}
