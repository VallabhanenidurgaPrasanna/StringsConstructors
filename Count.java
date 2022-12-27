
//WAP to count frequency of each character in a string
import java.util.*;

public class Count {
  public void frequencyCount() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string");
    String str = sc.nextLine();
    int count, count1, j = 0;
    char var = 'a';
    char var1 = 'A';
    char ch[] = str.toCharArray();
    while (j < 26) {
      count = 0;
      count1 = 0;
      for (int i = 0; i < str.length(); i++) {
        if (var >= 'a' || var1 >= 'A') {
          if (ch[i] == var) {
            count++;
          } else if (ch[i] == var1) {
            count1++;
          }
        }
      }

      if (count > 0) {
        System.out.println("Frequency of " + var + " is " + count);
      }
      if (count1 > 0) {
        System.out.println("Frequency of " + var1 + " is " + count1);
      }
      var++;
      var1++;
      j++;
    }
  }

  public static void main(String args[]) {
    Count c = new Count();
    c.frequencyCount();
  }

}