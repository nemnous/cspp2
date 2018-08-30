/**
 * author:nemnous.
 * addition of matrices.
 */
import java.util.Scanner;
public class Remix {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int row1 = inp.nextInt();
		int col1 = inp.nextInt();
		int[][] mat1 = readmat(row1, col1);
		int row2 = inp.nextInt();
		int col2 = inp.nextInt();
		int[][] mat2 = readmat(row2, col2);
		if (row1 == row2 && col1 == col2) {
			for (int i =0; i < row1; i++) {
				for(int j =0; j < col1; j++) {
					if (i < col1) {
					System.out.print(mat1[i][j]+mat2[i][j]+" ");
					} else {
					System.out.print(mat1[i][j]+mat2[i][j]+"");
					}
				}
				System.out.println();
		} 
		} else {
			System.out.println("not possible");
	}
}

	static int[][] readmat(int row, int col) {
		Scanner inp = new Scanner(System.in);
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j =0; j < col; j++) {
				arr[i][j] = inp.nextInt();
			}
		}
		return arr;
	}
}