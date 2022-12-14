import java.util.Scanner;

public class EOCount {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = s.nextInt();
    int arr[] = new int[n];
    int evencount=0,oddcount=0;
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < arr.length; i++) {

      arr[i] = s.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {

        evencount++;
      }
      else{
        oddcount++;

      }  
    }
        System.out.println("the number of even values are" + evencount);
        System.out.println("the number of odd values are" + oddcount);

  }
}