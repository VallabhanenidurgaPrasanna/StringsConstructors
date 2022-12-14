import java.util.Scanner;

public class ArraySum {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter n value");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("the sum of values are" + sum);
  }

}
