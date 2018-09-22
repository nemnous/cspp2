import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		// int[][] b = new int[3][3];
		int m = inp.nextInt();
		int n = inp.nextInt();
		int[][] b = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = inp.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n - 1; j++) {
		                System.out.print(b[i][j] + " ");
		            }
		            System.out.println(b[i][n - 1]);
		        }
			}
} 
