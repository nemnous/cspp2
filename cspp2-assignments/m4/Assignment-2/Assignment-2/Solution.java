import java.util.Scanner;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int row1 = Integer.parseInt(inp.next());
		int col1 = Integer.parseInt(inp.next());
		int[][] arr1 = new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0;j < col1; j++) {
				arr1[i][j] = Integer.parseInt(inp.next());
			}
		}
		int row2 = Integer.parseInt(inp.next());
		int col2 = Integer.parseInt(inp.next());
		int[][] arr2 = new int[row2][col2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0;j < col2; j++) {
				arr2[i][j] = Integer.parseInt(inp.next());
			}
		}
		if (row1 == row2 && col1 == col2){
			for (int i = 0; i < row2; i++) {
			for (int j = 0;j < col2; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.print('\b');
			System.out.println("");
		}	
		}
		else {
			System.out.println("not possible");
		}
		
	}
}