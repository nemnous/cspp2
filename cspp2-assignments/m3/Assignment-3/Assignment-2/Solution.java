
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        for(int i =1; i <= n; i++) {
        	int t = i;
        	while(t != 0) {
        		int rem = t % 10;
        		if(rem == 7) {
        			count ++;
        		}
        		t /= 10;

        	}
        }
        System.out.println(count);
    }
}