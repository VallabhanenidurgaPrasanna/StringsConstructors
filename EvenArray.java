import java.util.Scanner;

public class EvenArray {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter n value");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < arr.length; i++) {

      arr[i] = s.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      
      if (arr[i] % 2 == 0) {
        System.out.println("the even values are" + arr[i]);
      }
      else{
                System.out.println("the odd values are" + arr[i]);

      }  
        
  }

}