import java.util.Scanner;

public class Det2x2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[][] matrix = new int[2][2];
		for(int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				matrix[i][j] = inp.nextInt();
		// return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
		System.out.println((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0])); 
	}
}