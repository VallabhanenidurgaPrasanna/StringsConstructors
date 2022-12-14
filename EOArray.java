import java.util.Scanner;

public class EOArray {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = s.nextInt();
    int arr[] = new int[n];
    int oddsum = 0;
    int evensum = 0;
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < arr.length; i++) {

      arr[i] = s.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evensum = evensum + arr[i];

      } else {
        oddsum = oddsum + arr[i];

      }
    }
    System.out.println("the sum even values are" + evensum);
    System.out.println("the odd values are" + oddsum);

  }

}