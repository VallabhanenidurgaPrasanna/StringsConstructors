import java.util.Scanner;

public class Prime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int count = 0;// 1
    for (int i = 1; i < num; i++) {// num=3
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");

    }
  }
}
