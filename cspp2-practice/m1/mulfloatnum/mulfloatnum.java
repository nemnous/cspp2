import java.util.Scanner;

public class mulfloatnum{
	public static void main(String[] args) {
		System.out.println("enter two float numbers");
		Scanner inp = new Scanner(System.in);
		float a = inp.nextFloat();
		float b = inp.nextFloat();
		multiply mul = new multiply(a, b);
	}
}
class multiply{
	public multiply(float a, float b){
		float c = a * b;
		System.out.println(c);
	}
}