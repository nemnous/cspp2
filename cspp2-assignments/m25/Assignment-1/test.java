class Task {
	String title, assignedTo, status;
	int timeToComplete;
	boolean important;
	boolean urgent;

	public Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	public String toString() {
		return (title +", " + assignedTo + ", " + timeToComplete +", " +important +", " + urgent +", " + status);
	}
}
public class test {
	public static void main(String[] args) {
		Task t = new Task("task1" ,"akshay",30,y,y,"todo");
		System.out.println( t.toString());
	}
}