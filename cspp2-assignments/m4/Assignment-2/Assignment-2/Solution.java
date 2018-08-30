/**
 * author: @nemnous.
 * Date: 30 Aug 2018
 * Addition of matrices
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
         * unused constructor.
         */
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner inp = new Scanner(System.in);
        int row1 = Integer.parseInt(inp.next());
        int col1 = Integer.parseInt(inp.next());
        int[][] arr1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = Integer.parseInt(inp.next());
            }
        }
        int row2 = Integer.parseInt(inp.next());
        int col2 = Integer.parseInt(inp.next());
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = Integer.parseInt(inp.next());
            }
        }
        if (row1 == row2 && col1 == col2) {
            for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                if (j != col2 - 1) {
                    System.out.print(arr1[i][j] + arr2[i][j] + " ");
                } else {
                    System.out.print(arr1[i][j] + arr2[i][j]);
                }
                // String b = (j != col2 - 1) ? " " : "";
            }
            System.out.println("");
        }
        } else {
            System.out.println("not possible");
        }
    }
}
