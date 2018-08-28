/**
    * author: @nemnous.
    * Date: 27 Aug 2018
    * Display name and number.
*/

import java.util.Scanner;
/**
    * this is main class.
*/

public final class Solution {
    /**
     * this is an constructor object.
     */
    private Solution() {
        /**
            * unused.
        */
    }
    /**
        * @param args is an argument.
    */
    public static void main(final String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        String roll = inp.nextLine();
        System.out.println("Name :" + name + "Roll Number :" + roll);
    }
}
