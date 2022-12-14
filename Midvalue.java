import java.util.Scanner;

public class Midvalue {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int mid = 0;
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr.length % 2 == 0) {
        mid = (arr.length/ 2) - 1;
         mid = arr.length / 2;
      } else {
       mid=arr.length/2;
      }
    }
    System.out.println("the mid value is" + mid);
  }
}
