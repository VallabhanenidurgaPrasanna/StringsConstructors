import java.util.Scanner;

public class Printn {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    for (int i = 0; i <= num; i++) {
      System.out.print(i + " ");
    }
  }
}