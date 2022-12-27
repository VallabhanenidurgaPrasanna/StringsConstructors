
//arthemetic exception

import java.util.*;

class ArthemeticExcep {

  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    try {
      System.out.println((a / b));
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Exception handles");
    System.out.println(a);
    System.out.println(b);
  }
}