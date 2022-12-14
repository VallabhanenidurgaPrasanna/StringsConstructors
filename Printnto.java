import java.util.Scanner;

public class Printnto {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    for (int i = num; i >= 1; i--) {
      System.out.print(i + " ");
    }
  }
}