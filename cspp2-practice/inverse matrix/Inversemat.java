/**
 * author: @nemnous.
 * inverse of a matrix.
 */
import java.util.Scanner;

public class Inversemat {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter matrix:");
		for(int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = inp.nextInt();
		int Det3x3 = 0;
		int[][] cofact = CofactorMat(matrix);
		for (int i = 0; i < 3; i++) 
			Det3x3 += cofact[i][0];
		int[][] AdjMat = new int[3][3];
		for (int i = 0 ; i < 3; i++)
			for (int j = 0 ; j < 3; j++)
				AdjMat[i][j] = cofact[j][i];
		int[][] inverse = new int[3][3];
		for (int i = 0 ; i < 3; i++)
			for (int j = 0 ; j < 3; j++)
				inverse[i][j] = Det3x3 * AdjMat[i][j];
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(inverse[i][j]);
			}
			System.out.println("");
		}
	}
	public static int Det2x2 (int[][] matrix) {
			return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
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
	public static int[][] CofactorMat(int[][] matrix) {
		int[][] CofactorMat = new int[3][3];
		// int[][] AdjMat = new int[3][3]; 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				CofactorMat[i][j] = (int)(Math.pow(1,i+j)*Det2x2(removerc(matrix,i,j)));
			}
		}
		return CofactorMat;
	}
	// public static int[][] adjoint(int[][] matrix) {
	// 	for (int i = 0 ; i < 3; i++)
	// 		for (int j = 0 ; j < 3; j++)
	// 			AdjMat[i][j] = CofactorMat[j][i];
	// 	return AdjMat;
	// }
}