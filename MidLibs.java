import java.sql.Time;
import java.util.*;

/**
 * MidLibs Game
 * @author David Kreidler
 * @author Charlie Francesconi
 */
public class MidLibs{
    /*
     * Runs the main Midlibs game. Prints a random madlib to the terminal
     * @param args default
     */
    public static void main(String [] args){
        Random rand = new Random(890);
        String[] madLib = WordRead.get(args[0]);
        for(int i = 0; i < madLib.length; i++) {
            madLib[i] = replace(madLib[i], rand);
        }
        Formatter.writeInColumns(madLib, 35);
        
    }

<<<<<<< HEAD
    /*
     * @param
     * @param
     * @return
=======
    /**
     * @param flag The noun, adjective, or verb that needs to be replaced
     * @param rand Random object
     * @return returns a random word from the randomword method
>>>>>>> 1d56753930bd67d6cdb33b727698c29026f585e4
     */
    public static String replace(String flag, Random rand) {
        if(flag.equals("@nounp")) {
            flag = randomWord("nouns.txt", rand) + "s";
        } else if(flag.equals("@adjective")) {
            flag = randomWord("adjectives.txt", rand);
        } else if(flag.equals("@verb")) {
            flag = randomWord("verbs.txt", rand);
        }
        return flag;
    }

<<<<<<< HEAD
    /*
     * @param
     * @param
     * @return
=======
    /**
     * @param file The name of the file
     * @param rand Random integer to gt a random word
     * @return returns a random word
>>>>>>> 1d56753930bd67d6cdb33b727698c29026f585e4
     */
    public static String randomWord(String file, Random rand) {
        String[] fileWords = WordRead.get(file);
        int myrand = rand.nextInt(fileWords.length);
        return fileWords[myrand];
    }
}