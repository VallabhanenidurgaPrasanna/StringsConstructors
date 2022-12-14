import java.util.Scanner;

public class Palindromefor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int rem = 0, rev = 0, temp = num;
    for (int i = num; num != 0; num = num / 10) {
      rem = num % 10;
      rev = rev * 10 + rem;
    }
    if (rev == temp) {
      System.out.println("the given number is a palindrome");
    } else {
      System.out.println("the given number is not a palindrome");
    }
  }
}
