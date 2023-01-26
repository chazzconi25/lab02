/**
 * Reads in text from a file to construct a linked list of all the words
 * @author David Kreidler
 */

import java.io.*;
import java.util.*;
/**
 * Reads in text from a file and creates a linked list
 * @param fname The name of the file.
 */
public class WordRead{
    public static String[] get(String fname) {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(fname));
        } catch(IOException e) {
            e.printStackTrace(); System.exit(1);
        }

        StringNode stringList = null; 

        while(sc.hasNext()){
            stringList = ListStuff.addToFront(sc.next(), stringList);
        }
        return ListStuff.listToArray(stringList);
    }

    /**
     * Prints out the contents of the linked list
     * @param args default
     */

    public static void main(String [] args){
        String[] S = get("nouns.txt");

        for(int i = S.length - 1; i >= 0; i--){
            System.out.println(S[i]);
        }
    }
}