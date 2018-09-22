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
			System.out.println("Invalid timeToComplete" + timeToComplete);
			System.exit(0);
		}
		this.important = important;
		this.urgent = urgent;
		if(status.equals("todo") || status.equals("done")) {
			this.status = status;
		} else {
			System.out.println("Invalid status" + status);
			System.exit(0);
		}

	}
	public String toString() {
		String imp,urg;
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
    	for(Task t : taskArray) {
    		System.out.println(t.toString());
    	}
    	return "";
    }
    public Task getNextTask(String name) {
    	for(Task t : taskArray) {
    		if(t.assignedTo.equals(name)) {
    			if(t.important && !t.urgent) {
    				return t;
    			}
    		}
    	}
  		for(Task t : taskArray) {
    		if(t.assignedTo.equals(name)) {
    			if(t.important && t.urgent) {
    				return t;
    			}
    		}
    	}
    	return null;
    }
    // public Task getNextTask(String name, int count) {
    // 	Task[] getArray = new Task[10];
    // 	for(int i = 0; i < count; i++) {
    // 		if(getNextTask(name) != null) {

    // 		}
    // 	}
    public Task[] getNextTask(String name, int count) {
    	Task[] getArray = new Task[10];
    	int j = 0;
    	if(j <= count) {
	    	for(Task t : taskArray) {
	    		if(t.assignedTo.equals(name)) {
	    			if(t.important && !t.urgent) {
	    				getArray[j++] = t;
	    				continue;
	    			}
	    		}
	    	}
	  		for(Task t : taskArray) {
	    		if(t.assignedTo.equals(name)) {
	    			if(t.important && t.urgent) {
	    				getArray[j++] = t;
	    			}
	    		}
	    	}
	    	}
	    return getArray;
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
                // case "total-time":
                //     System.out.println(todo.totalTime4Completion());
                // break;
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
