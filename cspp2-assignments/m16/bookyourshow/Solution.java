import java.util.*;
import java.io.BufferedInputStream;


class Show {
    private String movie;
    private String showTime;
    private String[] seats;

    Show (String movie, String showTime, String[] seats) {
        this.movie = movie;
        this.showTime = showTime;
        this.seats = seats;
    }

    String getMovie() {
        return movie;
    }

    String getShowTime() {
        return showTime;
    }


    String[] getSeats()  {
        return seats;
    }

    void setSeatNA(int index) {
        seats[index] = "N/A";
    }

    public String toString() {
        return movie + "," + showTime;
    }
}

class Patron {
    private String name;
    private String mobile;

    Patron (String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    String getName() {
        return name;
    }

    String getMobile() {
        return mobile;
    }

    public String toString() {
        return name + " " + mobile;
    }
}

class BookYourShow {
    ArrayList<Show> showList;
    ArrayList<String> ticketList;

      BookYourShow() {
        showList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }

    void addAShow(Show show) {
        showList.add(show);
    }

    Show getAShow(String movie, String showTime) {
        for (Show show : showList)
            if (show.getMovie().equals(movie) && show.getShowTime().equals(showTime))
                return show;
        return null;
    }

    void bookAShow(String movie, String showTime, Patron patron, String[] seats) {
        Show show = getAShow(movie, showTime);
        if (show == null) {
            System.out.println("No show");
            return;
        }
        boolean flag = false;
        String[] sseats = show.getSeats();
        for (String seat : seats)
            for (int i = 0; i < sseats.length; i++)
                if (seat.equals(sseats[i])) {
                    show.setSeatNA(i);
                    flag = true;
                }


        if (flag) {
            ticketList.add(patron.getMobile()+" "+movie+" "+showTime);
        }
        // System.out.println(ticketList);
    }

    void printTicket(String movie, String showTime, String mobile) {
        String t = mobile+" "+movie+" "+showTime;
        if (ticketList.contains(t))
            System.out.println(t);
        else
            System.out.println("Invalid");
    }

    void showAll() {
        for (Show show : showList)
            System.out.println(show.toString() + "," + Arrays.toString(show.getSeats()).replace(" ",""));
    }
}


public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		BookYourShow bookshow = new BookYourShow();
		int testcase = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < testcase; i++){
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] token = line.split(" ");
				switch (token[0]) {
					case "add":
						String movie = token[1].split(",")[0];
						String time = token[1].split(",")[1] + " " + token[2] + " " + token[3] + " " + token[4].split(",")[0];
						String[] tempseats = token[4].split(",");
						String[] seats = new String[tempseats.length - 1];
						for(int j = 0; j < tempseats.length-1; j++) {
							seats[j] = tempseats[j+1].replace("[","").replace("]","");
						}
						bookshow.addAShow(movie,time,seats);
						break;
					case "book":
						String movie = token[1].split(",")[0];
						String time = token[1].split(",")[1] + token[2] + token[3] + token[4].split(",")[0];
						String[] tempseats = token[4].split(",");
						String[] seats = new String[tempseats.length - 3];
						String name = tempseats[1];
						String phone = tempseats[2];
						for(int i = 0; i < tempseats.length-3; i++) {
							seats[i] = tempseats[i+3].replace("[","");
							seats[i] = seats[i].replace("]","");
						}
						bookshow.book(movie,time,seats);
						break;

					case "get":
						String movie = token[1].split(",")[0];
						String time = token[1].split(",")[1] + " " + token[2] + " " + token[3] + " " + token[4].split(",")[0];
						bookshow.get(movie,time);

				}
			}	
		}
	}
}