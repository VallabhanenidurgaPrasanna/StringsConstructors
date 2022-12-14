
//write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;

public class Multiply {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num1 = sc.nextInt();
    for (int i = 1; i <= 1; i++) {
      if (num1 % 5 == 0) {
        System.out.println("the number is divisible by 5- " + num1);
      }
      if (num1 % 11 == 0) {
        System.out.println("the number is divisible by 11- " + num1);
      } else {
        System.out.println("the number is not divisible by both 5 and 11");

      }
    }
  }
}
