/**
 * @author : nemonous.
 * Date : 1 Sep 2018
 * round of matrix
 */
import java.util.Scanner;
/**
 * class Solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int rows,
                                             final int columns) {
        int[][] matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            final int hundred = 100;
            for (int k = 0; k < a[i][j] + hundred; k += hundred) {
                int low = k;
                int high = k + hundred;
                int mid = (low + high) / 2;
                if (a[i][j] > low && a[i][j] <= high) {
                    if (a[i][j] < mid) {
                        matrix[i][j] = low;
                        break;
                    } else {
                        matrix[i][j] = high;
                        break;
                    }
                }
            }
        }
    }
    return matrix;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
