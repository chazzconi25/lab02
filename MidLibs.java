import java.util.*;

/**
 * MidLibs Game
 * @author David Kreidler
 * @author Charlie Francesconi
 */
public class MidLibs{
    /**
     * Runs the main Midlibs game. Prints a random madlib to the terminal using
     * a filename passed in terminal with a madlib.
     * @param args The file to be used as a madlib containing flags
     */
    public static void main(String [] args){
        Random rand = new Random(890);
        String[] madLib = WordRead.get(args[0]);
        for(int i = 0; i < madLib.length ; i++) {
            madLib[i] = replace(madLib[i], rand);
        }
        Formatter.writeInColumns(madLib, 35);
        
    }

    /**
     * Checks if a String is a flag for a noun, adjective, or verb
     * if it is a flag then change the String to a random noun, adjective, or
     * verb from a file of that category.
     * @param flag String represnting a word that may be a flag
     * @param rand Seeded random object
     * @return returns a random word from the randomword method
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

    /**
     * Takes a given filename and a random object to produce a random word
     * from that file.
     * @param file Name of the file to generate a random word from
     * @param rand Seeded random object used to generate a random number
     * @return returns a random word from the given file
     */
    public static String randomWord(String file, Random rand) {
        String[] fileWords = WordRead.get(file);
        int myrand = rand.nextInt(fileWords.length);
        return fileWords[myrand];
    }
}