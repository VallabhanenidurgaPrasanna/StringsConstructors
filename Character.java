import java.util.Scanner;

class Method {
  String str = "welcome@123";

  public void countAlphabets() {
    int acount = 0;
    for (int i = 0; i < str.length(); i++) {
      if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
        acount++;
      }
    }
    System.out.println("acount is" + acount);
  }

  public void countDigits() {
    int dcount = 0;
    for (int i = 0; i < str.length(); i++) {
      if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
        dcount++;
      }
    }
    System.out.println("acount is" + dcount);
  }

  public void countSpecial() {
   int scount = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)== '@'||str.charAt(i)=='%') {
        scount++;
      }
    }
    System.out.println("scount is "+scount);
  }
}

public class Character {
  public static void main(String args[]) {
    Method m = new Method();
    m.countAlphabets();
    m.countDigits();
    m.countSpecial();
  }
}