///WAP to find first and last occurrence of a character in a given string.
public class FLoccrence {
  String str = "Prasanna";
 public void first() {
      int index1 = str.indexOf('a');
      System.out.println("The first index of character a in the string: "+index1);
    }
  public void last() {
    int index2=str.lastIndexOf('a');
    System.out.println("The last index of character a in the string: "+index2);
  }
  
  public static void main(String args[]) {
    FLoccrence fl = new FLoccrence();
    fl.first();
    fl.last();
  }
}