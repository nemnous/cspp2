/**
 * author: @nemnous.
 * Date: 28th Aug 18.
 * Roots of Quadratic expression
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
     * main function.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
     * roots of quadratic equation.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    static void rootsOfQuadraticEquation(final int a,
                         final int b, final int c) {
        final int t1 = 4;
        double t = b * b - (t1 * a * c);
        double root1 = (-b + Math.sqrt(t)) / (2 * a);
        double root2 = (-b - Math.sqrt(t)) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}
