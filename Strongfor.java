import java.util.Scanner;

public class Strongfor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int fact = 1, sum = 0, temp = num, rem = 0;// 145
    for (; num != 0; num = num / 10) {
      rem = num % 10;//5//4//0
      while (rem >= 1) {
        fact = fact * rem;//5//20
        rem--;//4//3
      }
      sum = sum + fact;//120//
      fact = 1;
    }
    if (sum == temp) {
      System.out.println("The given number is a Strong number");
    } else {
      System.out.println("The given number is not a Strong number");

    }
  }
}
