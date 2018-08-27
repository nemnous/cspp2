import java.util.Scanner;

public class operations{
	public static void main(String[] args) {
		System.out.println("Enter a and b:");
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		add obj = new add();
		obj.add(a,b);
	}
	
}

class add{
	public void add(int a,int b){
		int c = a + b;
		System.out.println("sum = " + c);
	}
}