/**
 * Reads in text from a file to construct a linked list of all the words
 * @author Charlie Francesconi
 * @author David Kreidler
 * 
 */

public class ListStuff {
<<<<<<< HEAD
  /**
   * @param s word to be added to the linked list
   * @param Nold StringNode object to create linked list
   * @return returns a StringNode reference representing the list obtained by adding s to the front of list Nold
   */
=======
  // addToFront(s,Nold) returns a StringNode reference representing the list
  // obtained by adding s to the front of list Nold
>>>>>>> 2a8a8144cef856e3223fe599453ad1ee131c0796
  public static StringNode addToFront(String s, StringNode Nold) {
    StringNode front = new StringNode();
    front.data = s;
    front.next = Nold;
    return front;
  }

<<<<<<< HEAD
  /** 
   * @param N StringNode object to create linked list
   * @returnreturns a reference to an array containing the same strings as in the list N (in the order they were received)
   */
=======
  // listToArray(N) returns a reference to an array containing the same
  // strings as in the list N (in the order they were received)
>>>>>>> 2a8a8144cef856e3223fe599453ad1ee131c0796
  public static String[] listToArray(StringNode N) {
    int length = ListLen(N);
    String [] A = new String[length];
    for(int i = 0; i < length; i++) {
      A[i] = N.data;
      N = N.next;
    }
    return A;
  }
  /**
   * @param Nold Linked List
   * @return returns the length of the linked list
   */
  public static int ListLen(StringNode Nold) {
    if(Nold == null) {
      return 0;
    }
    return 1 + ListLen(Nold.next);
  }
  /**
   * Creates a linked list
   * Prints out the contents of the linked list
   * @param args default
   */
  public static void main(String [] Args) {
    StringNode N = null;
<<<<<<< HEAD
    N = addToFront("rat",N);  
=======
    N = addToFront("rat",N);
>>>>>>> 2a8a8144cef856e3223fe599453ad1ee131c0796
    N = addToFront("dog",N);  
    N = addToFront("pig",N);  
    String[] A = listToArray(N);
    for(int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    } 
  }
}
