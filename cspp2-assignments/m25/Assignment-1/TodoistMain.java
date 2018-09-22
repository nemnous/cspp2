import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
	String title, assignedTo, status;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String imp,urg;

	public Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
		if(title.equals("")) {
			System.out.println("Title not provided");
			System.exit(0);

		}
		else {
			this.title = title;
		}
		this.assignedTo = assignedTo;
		if(timeToComplete > 0) {
			this.timeToComplete = timeToComplete;
		} else {
			System.out.println("Invalid timeToComplete " + timeToComplete);
			System.exit(0);
		}
		this.important = important;
		this.urgent = urgent;
		if(status.equals("todo") || status.equals("done")) {
			this.status = status;
		} else {
			System.out.println("Invalid status " + status);
			System.exit(0);
		}
		if(important) {
			imp = "Important";
		} else {
			imp = "Not Important";
		}
		if(urgent) {
			urg = "Urgent";
		} else {
			urg = "Not Urgent";
		}

	}
	public String toString() {
		return (title +", " + assignedTo + ", " + timeToComplete +", " +imp +", " + urg +", " + status);
	}
}

class Todoist {
	Task[] taskArray;
	int size;
	Todoist() {
		taskArray = new Task[10];
		size = 0;
	}
	public void addTask(Task mytask) {
		if(size == taskArray.length) {
			resize();
		}
		taskArray[size++] = mytask;
	}
	public void resize() {
        taskArray = Arrays.copyOf(taskArray, 2 * taskArray.length);
    }
    public String toString() {
    	String str = "";
    	int i;
    	for(i = 0; i < size-1; i++) {
    		str += taskArray[i].toString() + "\n";
    	}
    	str += taskArray[i];
    	return str;
    }
    public Task getNextTask(String name) {
    	for(int i = 0; i < size; i++) {
    		if(taskArray[i].assignedTo.equals(name)) {
    			if(taskArray[i].important && !taskArray[i].urgent && taskArray[i].status.equals("todo")) {
    				return taskArray[i];
    			}
    		}
    	}
  		for(int i = 0; i < size; i++) {
    		if(taskArray[i].assignedTo.equals(name)) {
    			if(taskArray[i].important && taskArray[i].urgent && taskArray[i].status.equals("todo")) {
    				return taskArray[i];
    			}
    		}
    	}
    	return null;
    }
    public Task[] getNextTask(String name, int count) {
    	Task[] getArray = new Task[10];
    	Task[] mrArray = new Task[count];
    	// for(int i = 0; i < count; i++) {
    	// 	if(getNextTask(name) != null) {

    	// 	}
    	int j = 0;
    		for(int i = 0; i < size && j <= count; i++) {
	    		if(taskArray[i].assignedTo.equals(name)) {
	    			if(taskArray[i].important && !taskArray[i].urgent && taskArray[i].status.equals("todo")) {
	    				 getArray[j++] = taskArray[i];
	    			}
	    		}
    		}
	  		for(int i = 0; i < size && j <= count; i++) {
	    		if(taskArray[i].assignedTo.equals(name)) {
	    			if(taskArray[i].important && taskArray[i].urgent && taskArray[i].status.equals("todo")) {
	    				getArray[j++] = taskArray[i];
	    			}
	    		}
	    	}
	    	for(int i = 0; i < count; i++) {
	    		mrArray[i] = getArray[i];
	    	}
    	return mrArray;
    	}
    // public Task[] getNextTask(String name, int count) {
    // 	Task[] getArray = new Task[count];
    // 	int j = 0;
	   //  	for(int i = 0; i < size; i++) {
	   //  		if(taskArray[i].assignedTo.equals(name)) {
	   //  			if(taskArray[i].important && !taskArray[i].urgent) {
	   //  				getArray[j++] = taskArray[i];
	   //  				continue;
	   //  			}
	   //  		}
	   //  	}
	  	// 	for(int i = 0; i < size; i++) {
	   //  		if(taskArray[i].assignedTo.equals(name)) {
	   //  			if(taskArray[i].important && taskArray[i].urgent) {
	   //  				getArray[j++] = taskArray[i];
	   //  			}
	   //  		}
	   //  	}
	   //  return getArray;
	   //  }
	    public int totalTime4Completion() {
	    	int sum = 0;
	    	for(int i = 0; i < size; i++) {
	    		if(taskArray[i].status.equals("todo"))
	    			sum += taskArray[i].timeToComplete;
	    	}
	    	return sum;
	    }
}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
