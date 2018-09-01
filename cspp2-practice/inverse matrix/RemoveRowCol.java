import java.util.Scanner;

public class RemoveRowCol {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for(int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = inp.nextInt();
			// inp.nextLine();
		System.out.println("enter row and col:");
		int row = inp.nextInt();
		int col = inp.nextInt();
		int[][] alphamat2x2 = removerc(matrix, row, col);
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(alphamat2x2[i][j]);
			}
			System.out.println("");
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
			m++;
				}
			return mat1;
			}
		}
