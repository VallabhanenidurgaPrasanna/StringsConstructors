import java.util.Scanner;

public class Secondhigh {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = s.nextInt();
    int max2 = 0;
    System.out.println("Enter " + n + " values");
    int max = s.nextInt();
    int min=s.nextInt();
    for (int i = 1; i < n; i++) {
      int value = s.nextInt();
      if (max < value) {
        max2 = max;
        max = value;
      } else if (max2 < value) {
        max2 = value;
      } else if (min > value) {
        min = value;
      }
    }
    System.out.println("the max value is " + max);
    System.out.println("the  second max value is " + max2);
    System.out.println("the  min value is " + min);

  }
}
