public class ListStuff {
  // addToFront(s,Nold) returns a StringNode reference representing the list obtained by adding s to the front of list Nold
  public static void addToFront(String s, StringNode Nold) {
    StringNode front = new StringNode();
    front.data = s;
    front.next = Nold;
    Nold = front;
  }

  public static void addToBack(String s, StringNode Nold){
    if(Nold == null){
      addToFront(s, Nold);
    }
    else{
      StringNode back = Nold;
      while(back.next != null){
        back = back.next;
      }
      addToFront(s,back.next);
    }
  }

  // listToArray(N) returns a reference to an array containing the same strings as in the list N (in the order they were received)
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
    StringNode N = new StringNode();      // at this point N *is* an empty list
    addToFront("rat",N);  // at this point N *is* the list ("rat")
    addToFront("dog",N);  // at this point N *is* the list ("dog","rat")
    addToFront("pig",N);  // at this point N *is* the list ("pig","dog","rat")
    String[] A = listToArray(N);
    for(int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    } 
  }
}
