import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    //Good luck :-)
    private int[] set;
    private int size;

    public Set() {
    	set = new int[10];
    	size = 0;
    }

    public Set(int n) {
    	set = new int[n];
    	size = 0;
    }
    public int size() {
    	return size;
    }
    public Boolean contains(int number) {
    	for (int i = 0; i < size; i++) {
    		if (set[i] == number) {
    			return true;
    		}
    	}
    	return false;
    }
    public void add(int number) {
    	if (!contains(number)) {
    		set[size++] = number;
    	}
    }
    public void add(int[] array) {
    	if (size == set.length) {
    		resize();
    	}
    	for(int i = 0; i < array.length; i++) {
    		add(array[i]);
    	}
    }
    public Set intersection(Set setB) {
    	Set temp = new Set();
    	// for(int i = 0; i < setB.size(); i++) {
    	// 	if(contains(setB.set[i])) {
    	// 		temp.add(setB.set[i]);
    	// 	}
    	// }
    	for(int i = 0; i < size; i++) {
    		if(setB.contains(set[i])) {
    			temp.add(set[i]);
    		}
    	}
    	return temp;
    }
    public void resize() {
        set = Arrays.copyOf(set, 2 * set.length);
    }
    public Set retainAll(int[] array) {
    	Set temp = new Set();
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			if (set[i] == array[j]) {
    				temp.add(array[j]);
    			}
    		}
    	}
    	return temp;
    }
    public int[][] cartesianProduct(Set setB) {
    	int[][] Arr = new int[1][size * setB.size()];
    	// int[][] Arr = new int[size][setB.size()];
    	int[] pair = new int[2];
    	for (int k = 0; k < size*setB.size(); k++) {
    		for (int i = 0; i < size; i++) {
	    		for (int j = 0; j < setB.size(); j ++) {
	    			pair[0] = set[i];
	    			pair[1] = setB.set[j];
	    		}
	    		Arr[k] = pair;
	    	}
    	}
    	return Arr;
    }
    public String toString() {
        // Replace the code below
        if (size == 0) {
        	return "{}";
        }
        String str = "{";
        for (int i = 0; i < size - 1; i++) {
        	str += (set[i] + ", ");
        }
        str += (set[size-1] + "}");
        return str;
    } 
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
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
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
