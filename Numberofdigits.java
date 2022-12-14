import java.util.Scanner;

public class Numberofdigits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();// 1234
    int count = 0;
    for (int i = num; i != 0; i = i / 10) {// 123//12//1//0
      count++;// 1//2//3//4
    }
    System.out.println("The number of digits is " + count);
  }
}
