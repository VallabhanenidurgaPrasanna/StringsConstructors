public class LU {
  public static void main(String args[]) {
    String str = "Welcome TO Bitlabs";
    int ucount = 0, lcount = 0;
    System.out.println("Number of characters : " + str.length());
    for (int i = 0; i < str.length(); i++) {

      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        ucount++;
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        lcount++;
      }
    }
    System.out.println("The count of upper case letters are " + ucount);
    System.out.println("The count of lower case letters are " + lcount);

  }
}