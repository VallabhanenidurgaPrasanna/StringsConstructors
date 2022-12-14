
import java.util.Scanner;

public class LL {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first year");
    int year1 = sc.nextInt();
    System.out.println("enter second year");
    int year2 = sc.nextInt();
    for (int i = year1; i <= year2; i++) {
      if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
        System.out.println(i);
      }

    }
  }
}
