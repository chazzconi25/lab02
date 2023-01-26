/**
 * Reads in text from a file to construct a linked list of all the words
 * @author Charlie Francesconi
 * @author David Kreidler
 */

public class ListStuff {
  /**
   * Adds a new node with string s to the front of a linked list Nold
   * @param s word to be added to the linked list
   * @param Nold StringNode object to create linked list
   * @return StringNode representing the list obtained by adding s to the
   * front of list Nold
   */
  public static StringNode addToFront(String s, StringNode Nold) {
    StringNode front = new StringNode();
    front.data = s;
    front.next = Nold;
    return front;
  }

  /** 
   * Turns Linked list N into a Stiring array
   * @param N StringNode object to create linked list
   * @return String array representing all of the strings originally in the
   * linked list
   */
  public static String[] listToArray(StringNode N) {
    int length = ListLen(N);
    String [] A = new String[length];
    for(int i = length-1; i >= 0; i--) {
      A[i] = N.data;
      N = N.next;
    }
    return A;
  }
  /**
   * Takes a linked list Nold and returns the number of nodes in the list
   * @param Nold Linked List
   * @return Returns the length of the linked list
   */
  public static int ListLen(StringNode Nold) {
    if(Nold == null) {
      return 0;
    }
    return 1 + ListLen(Nold.next);
  }
  /**
   * Creates a linked list and prints out the contents of the linked list
   * @param args Default
   */
  public static void main(String [] Args) {
    StringNode N = null;
    N = addToFront("rat",N);  
    N = addToFront("dog",N);  
    N = addToFront("pig",N);  
    String[] A = listToArray(N);
    for(int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    } 
  }
}
