import java.io.*;
import java.util.*;

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

    public static void main(String [] args){
        String[] S = get("nouns.txt");

        for(int i = S.length - 1; i >= 0; i--){
            System.out.println(S[i]);
        }
    }
}