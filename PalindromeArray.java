import java.util.Scanner;

public class PalindromeArray {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = s.nextInt();
    int arr[] = new int[n];
    int count = 0;
    int i=0;
    int rem = 0; 
    int rev[i] = 0;
    int temp=arr[i];
    System.out.println("Enter " + n + " values");
    for (i = 0; i < arr.length; i++) {

      arr[i] = s.nextInt();
    }

    for (i = 0; i < arr.length; i++) {
 while (arr[i] != 0) {
        rem = arr[i] % 10;
        rev[i] = rev[i] * 10 + rem;
        arr[i] = arr[i] / 10;
      }
    }
    if (rev[i] == temp) {
      System.out.println("palindrome numbers " + rev[i]);
    }
      else{
              System.out.println("not palindrome numbers" + rev[i]);

      }
    }
  }
