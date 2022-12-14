import java.util.Scanner;

public class Perfect {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int sum = 0, temp = num;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {// 28
        sum = sum + i;
      }
    }
    if (sum == temp) {
      System.out.println("perfect number");
    } else {
      System.out.println("not a perfect number");
    }

  }
}