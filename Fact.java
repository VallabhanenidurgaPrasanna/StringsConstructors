import java.util.Scanner;

public class Fact {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int fact = 1, rem = 0;
    for (; num >= 1; num--) {//2
      // rem = rem % 10;
      fact = fact * num;
      // num--;

    }
    System.out.println("the factorial of given number is " + fact);
  }
}