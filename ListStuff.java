/**
 * Reads in text from a file to construct a linked list of all the words
 * @author David Kreidler
 */

public class ListStuff {
  // addToFront(s,Nold) returns a StringNode reference representing the list
  // obtained by adding s to the front of list Nold
  public static StringNode addToFront(String s, StringNode Nold) {
    StringNode front = new StringNode();
    front.data = s;
    front.next = Nold;
    return front;
  }

  // listToArray(N) returns a reference to an array containing the same
  // strings as in the list N (in the order they were received)
  public static String[] listToArray(StringNode N) {
    int length = ListLen(N);
    String [] A = new String[length];
    for(int i = 0; i < length; i++) {
      A[i] = N.data;
      N = N.next;
    }
    return A;
  }

  public static int ListLen(StringNode Nold) {
    if(Nold == null) {
      return 0;
    }
    return 1 + ListLen(Nold.next);
  }

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
