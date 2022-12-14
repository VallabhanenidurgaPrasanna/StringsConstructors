import java.util.Scanner;

public class FDproduct {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int ld = num % 10;
    int fd = 0;
    while (num >= 10) {
      num = num / 10;
      fd = num * ld;
    }
    System.out.println("the product of first and last digits are" + fd);
  }
}