/**
 * Prints an array Strings to console given a limited number of columns per 
 * line. If a String exceeds the column limint for that line it is printed on  
 * the next line.
 * @author Charlie Francesconi
 */

import java.util.*;

/**
 * Prints a string array to console given a limit of columns per line.
 */
public class Formatter {
    /**
     * Prints String array A to console given limit cols per line. If a String
     * in the array will exceed the current line limit of cols then it
     * is printed on a new line.
     * @param A String array with Strings to be printed to the console
     * @param cols Number of characters per line
     */
    public static void writeInColumns(String[] A, int cols) {
        int lineTotal = 0;
        for(int i = 0; i < A.length; i++) {
            if(lineTotal + 1 + A[i].length() > cols) {
                System.out.println();
                lineTotal = 0;
            }
            lineTotal += A[i].length() + 1;
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    /**
     * Debugging main method for testing get() method.
     * @param Args Default
     */
    public static void main(String [] Args) {
        Scanner in = new Scanner(System.in);
        String [] words = {"These", "are", "the", "times", "that", "try",
                            "men's", "souls."};
        System.out.print("cols = ");
        int cols = in.nextInt();
        writeInColumns(words, cols);
    }
}