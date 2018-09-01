public class funoverload {
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
	}
	static int add( int a , int b) {
		return a + b;
	}
	static int add(int a) {
		return a+1;
	}
	static int add(int a, int b, int c) {
		return a+4;
	}
}