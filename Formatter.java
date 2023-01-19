import java.util.*;
public class Formatter {
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

    public static void main(String [] Args) {
        Scanner in = new Scanner(System.in);
        String [] words = {"These", "are", "the", "times", "that", "try", "men's", "souls."};
        System.out.print("cols = ");
        int cols = in.nextInt();
        writeInColumns(words, cols);
    }
}