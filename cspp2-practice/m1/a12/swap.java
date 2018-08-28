import java.util.Scanner;
public class swap{
	public static void main(String[] args) {
		{
			System.out.println("Enter a and b:");
			Scanner inp = new Scanner(System.in);
			int a = inp.nextInt();
			int b = inp.nextInt();
			int t = a;
			a = b;
			b = t;
			System.out.println(a + "," + b);
		}
	}
}