/**
 * author: @nemnous.
 * Date: 29 Aug 2018
 * Convert the following to While Loop:
 * System.out.println(2);
 * System.out.println(4);
 * System.out.println(6);
 * System.out.println(8);
 * System.out.println(10);
 * System.out.println(GoodBye!)
 */
public final class ConverttoWhileLoop {
    /**
     * Constructs the object.
     */
    private ConverttoWhileLoop() {
        /**
         * does nothing.
         */
    }
    /**
     * main function.
     *
     * @param  args  The arguments
     */
    public static void main(final String[] args) {
        int i = 2;
        final int ten = 10;
        while (i <= ten) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("GoodBye");
    }
}
