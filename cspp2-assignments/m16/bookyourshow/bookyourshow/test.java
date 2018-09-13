import java.util.Scanner;
import java.io.BufferedInputStream;
public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		// BookYourShow bookshow = new BookYourShow();
			String line= scan.nextLine();
			String[] token = line.split(" ");
			String func = token[0];
			String movie = token[1].split(",")[0];
			String time = token[1].split(",")[1] + " " + token[2] + " " + token[3] + " " + token[4].split(",")[0];
			// String[] tempseats = token[4].split(",");
			// String[] seats = new String[tempseats.length - 3];
			// String name = tempseats[1];
			// String phone = tempseats[2];
			// for(int i = 0; i < tempseats.length-3; i++) {
			// 	seats[i] = tempseats[i+3].replace("[","");
			// 	seats[i] = seats[i].replace("]","");
			// }
			// for(String i : seats) {
			// 	System.out.println(i);
			// }
			System.out.println(movie+" " +time);
			// System.out.println(func+" "+movie+" "+time+" "+name+" "+phone);
			// for (String i : tokens)
			// 	System.out.println(i);
			// str = str.replace("[", "");
			// System.out.println(str);


	}
}