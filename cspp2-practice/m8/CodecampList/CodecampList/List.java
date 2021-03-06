/**
 * author: @nemnous.
 * Date: 04 Sep 2018
 *
 */
import java.io.BufferedInputStream;
import java.util.Scanner;
/**
 * List class.
 */
public class List {
    /**
     * { var_description }.
     */
    private int[] arr;
    /**
     * { var_description }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    public List() {
        final int twenty = 20;
        arr = new int[twenty];
        size = 0;
    }
    /**
     * { function_description }.
     * @param      item  The item
     */
    public void add(final int item) {
        //Inserts the specified element at the end of the list.
        arr[size++] = item;
    }
    /**
     * { function_description }.
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * { function_description }.
     * @param      index  The index
     */
    public void remove(final int index) {
        // write the logic for remove here.
        // Think about what to do to the size variable.
        if (index >= 0 && index <= size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size--] = 0;
        } else {
            System.out.println("Invalid Position Exception");
        }
    }

    /**
     * { function_description }.
     * @param      index  The index
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        // Replace the code below to write the code for get
        if (index >= 0 && index <= size) {
            return arr[index];
        }
        return -1;
    }
    /**
     * Returns a string representation of the object.
     * @return     String representation of the object.
     */
    public String toString() {
        // Replace the code below
        // return Arrays.toString(Arr);
        String res = "[";
        for (int i = 0; i < size - 1; i++) {
            res = res + arr[i] + ",";
        }
        res += arr[size - 1] + "]";
        return res;
    }
    /**
     * { function_description }.
     * @param      item  The item
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        // Replace the code below
        for (int i : arr) {
            if (item == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for the first match.
     * @param      item  The item
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * { function_description }.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "add":
                l.add(Integer.parseInt(tokens[1]));
                break;
            case "size":
                // invoke size method and print the list size
                // BTW, list size is not the array size
                // it is the number of items in the list
                System.out.println(l.size());
                break;
            case "print":
                // print the list (implement toString for this to work)
                // expected format is [item-1,item-2,...,item-n]
                // review the output testcase file
                System.out.println(l);
                break;
            case "remove":
                l.remove(Integer.parseInt(tokens[1]));
                break;
            case "indexOf":
                System.out.println(l.indexOf(Integer.parseInt(tokens[1])));
                break;
            case "get":
                int tmp = l.get(Integer.parseInt(tokens[1]));
                if (tmp != -1) {
                    System.out.println(tmp);
                }
                break;
            case "contains":
                System.out.println(l.contains(Integer.parseInt(tokens[1])));
                break;
            default :
                break;
            }
        }
    }
}
