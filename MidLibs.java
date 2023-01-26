/**
 * MidLibs Game
 * @author David Kreidler
 * @author Charlie Francesconi
 */
public class MidLibs{
    public static void main(String [] args){
        String[] madLib = WordRead.get(args[0]);
        Formatter.writeInColumns(madLib, 35);
    }
}