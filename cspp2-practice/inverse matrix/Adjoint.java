/**
 * author: @nemnous.
 */
import java.util.Scanner;
public class Adjoint {
	public static void main(String[] args) {
		int[][] CofactorMat = new int[3][3];
		int[][] AdjMat = new int[3][3];
		int[][] matrix = new int[3][3];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 3; j++)
				matrix[i][j] = inp.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// CofactorMat[i][j] = (Math.pow(-1,i+j)*Det2x2(removerc(matrix,i,j)));
				int[][] temp = removerc(matrix,i,j);
				int det = Det2x2(temp);
				System.out.println((int)Math.pow(-1,i+j)*det);
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				System.out.println(CofactorMat[i][j]);
			}
		}
	}
	public static int[][] removerc(int[][] matrix,int row,int col) {
		int[][] mat1 = new int[2][2];
		int m = 0;
		for (int i = 0; i < 3; i++) {
			if(i == row)
				continue;
			int n = 0;
			for (int j = 0; j < 3; j++) {
				if(j == col)
					continue;
				// if (i != row and j != col) {
				mat1[m][n] = matrix[i][j];
				n++;

				}
		}
		return mat1;
	}
	public static int Det2x2 (int[][] matrix) {
			return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
	}
}