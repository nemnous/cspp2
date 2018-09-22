import java.util.Scanner;
public class InverseReloaded {
	public static void main(String[] args) {
		System.out.println("enter matrix");
		double[][] matrix = new double[3][3];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				matrix[i][j] = inp.nextInt();
			}
		}
		// double[][] mat = removerc(matrix, 1, 2);
		
		double[][] cofactor = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				cofactor[i][j] = matrix[i][j]*Math.pow(-1,i+j)*Det2x2(removerc(matrix, i, j));
			}
		}
		double[][] adjoint = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				adjoint[i][j] = cofactor[j][i];
			}
		}
		System.out.println("Co-factor Matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				System.out.print(cofactor[i][j] + " ");
			}
			System.out.println("");
		}
		double Det3x3 = 0;
		for (int i = 0; i < 3; i++)
			Det3x3 += cofactor[1][i];
		System.out.println("Det: " + Det3x3 + "Inv Det:" + 1/Det3x3);
		if (Det3x3 == 0) {
			System.out.println("Enter Fucking matrix with det not equal to Zero");
			System.exit(0);
		}
		double[][] reverse = new double[3][3];
		System.out.println("Reverse Matrix:");
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				reverse[i][j] = (1/Det3x3)*adjoint[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				System.out.print(reverse[i][j] + " ");
			}
			System.out.println("");
		}
		// System.out.println(Det2x2(mat));
	}
	public static double[][] removerc(double[][] matrix,int row,int col) {
		double[][] mat1 = new double[2][2];
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
	public static double Det2x2 (double[][] matrix) {
			return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
	}
}