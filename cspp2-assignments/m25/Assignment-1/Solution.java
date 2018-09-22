import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
/**
 * Class for task.
 */

class Task {
    /**
     * { item_description }.
     */
    String title;
    String assignedTo;
    String status;
    int timeToComplete;
    boolean important;
    boolean urgent;
    String imp, urg;
    /**
     * Constructs the object.
     *
     * @param      title           The title
     * @param      assignedTo      The assigned to
     * @param      timeToComplete  The time to complete
     * @param      important       The important
     * @param      urgent          The urgent
     * @param      status          The status
     */
    public Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
        if (title.equals("")) {
            System.out.println("Title not provided");
            System.exit(0);

        } else {
            this.title = title;
        }
        this.assignedTo = assignedTo;
        if (timeToComplete > 0) {
            this.timeToComplete = timeToComplete;
        } else {
            System.out.println("Invalid timeToComplete " + timeToComplete);
            System.exit(0);
        }
        this.important = important;
        this.urgent = urgent;
        if (status.equals("todo") || status.equals("done")) {
            this.status = status;
        } else {
            System.out.println("Invalid status " + status);
            System.exit(0);
        }
        if (important) {
            imp = "Important";
        } else {
            imp = "Not Important";
        }
        if (urgent) {
            urg = "Urgent";
        } else {
            urg = "Not Urgent";
        }

    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return (title + ", " + assignedTo + ", " + timeToComplete + ", " + imp + ", " + urg + ", " + status);
    }
}
/**
 * Class for todoist.
 */
class Todoist {
    Task[] taskArray;
    int size;
    /**
     * Constructs the object.
     */
    Todoist() {
        taskArray = new Task[10];
        size = 0;
    }
    /**
     * Adds a task.
     *
     * @param      mytask  The mytask
     */
    public void addTask(Task mytask) {
        if (size == taskArray.length) {
            resize();
        }
        taskArray[size++] = mytask;
    }
    /**
     * { function_description }.
     */
    public void resize() {
        taskArray = Arrays.copyOf(taskArray, 2 * taskArray.length);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        int i;
        for (i = 0; i < size - 1; i++) {
            str += taskArray[i].toString() + "\n";
        }
        str += taskArray[i];
        return str;
    }
    /**
     * Gets the next task.
     *
     * @param      name  The name
     *
     * @return     The next task.
     */
    public Task getNextTask(String name) {
        for (int i = 0; i < size; i++) {
            if (taskArray[i].assignedTo.equals(name)) {
                if (taskArray[i].important && !taskArray[i].urgent && taskArray[i].status.equals("todo")) {
                    return taskArray[i];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (taskArray[i].assignedTo.equals(name)) {
                if (taskArray[i].important && taskArray[i].urgent && taskArray[i].status.equals("todo")) {
                    return taskArray[i];
                }
            }
        }
        return null;
    }
    /**
     * Gets the next task.
     *
     * @param      name   The name
     * @param      count  The count
     *
     * @return     The next task.
     */
    public Task[] getNextTask(String name, int count) {
        Task[] getArray = new Task[10];
        Task[] mrArray = new Task[count];
        // for(int i = 0; i < count; i++) {
        //  if(getNextTask(name) != null) {

        //  }
        int j = 0;
        for (int i = 0; i < size && j <= count; i++) {
            if (taskArray[i].assignedTo.equals(name)) {
                if (taskArray[i].important && !taskArray[i].urgent && taskArray[i].status.equals("todo")) {
                    getArray[j++] = taskArray[i];
                }
            }
        }
        for (int i = 0; i < size && j <= count; i++) {
            if (taskArray[i].assignedTo.equals(name)) {
                if (taskArray[i].important && taskArray[i].urgent && taskArray[i].status.equals("todo")) {
                    getArray[j++] = taskArray[i];
                }
            }
        }
        for (int i = 0; i < count; i++) {
            mrArray[i] = getArray[i];
        }
        return mrArray;
    }
    // public Task[] getNextTask(String name, int count) {
    //  Task[] getArray = new Task[count];
    //  int j = 0;
    //      for(int i = 0; i < size; i++) {
    //          if(taskArray[i].assignedTo.equals(name)) {
    //              if(taskArray[i].important && !taskArray[i].urgent) {
    //                  getArray[j++] = taskArray[i];
    //                  continue;
    //              }
    //          }
    //      }
    //  for(int i = 0; i < size; i++) {
    //          if(taskArray[i].assignedTo.equals(name)) {
    //              if(taskArray[i].important && taskArray[i].urgent) {
    //                  getArray[j++] = taskArray[i];
    //              }
    //          }
    //      }
    //  return getArray;
    //  }
    public int totalTime4Completion() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (taskArray[i].status.equals("todo"))
                sum += taskArray[i].timeToComplete;
        }
        return sum;
    }
}