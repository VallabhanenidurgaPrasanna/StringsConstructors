import java.util.Scanner;

public class EvenOddfor {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int evensum = 0, oddsum = 0;
    int rem = 0;
    for (int i = num; num != 0; num = num / 10) {// 1234
      rem = num % 10;
      if (rem % 2 == 0) {
        evensum = evensum + rem;
      } else {
        oddsum = oddsum + rem;
      }

    }
    System.out.println("even sum = " + evensum);
    System.out.println("odd sum = " + oddsum);
  }
}
