/**
     * author: @nemnous
     * Date: 28 Aug 2018
     * Area Of Circle
 */
import java.util.Scanner;
/**
    * Class for area of circle.
 */
public final class AreaOfCircle {
    /**
     * Constructs the object.
     */
    private AreaOfCircle() {
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        System.out.println("enter radius");
        Scanner inp = new Scanner(System.in);
        float radius = inp.nextFloat();
        final double pi = 3.14;
        System.out.println(pi * radius * radius);
    }
}
