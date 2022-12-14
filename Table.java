import java.util.Scanner;

public class Table {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter table number");
    int num = sc.nextInt();
    int i = 1;
    while (i <= 10) {
      System.out.println("the table is " + num + "*" + i + "=" + num * i);
      i++;
    }
  }
}