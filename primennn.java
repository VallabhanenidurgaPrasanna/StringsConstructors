import java.util.Scanner;

public class primennn {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int count = 0, i, j,k=0;
    for (i = 1; i < num; i++) {
      for (j = 2; j <= i; j++) {
        if (i % j == 0) {//
            count++;
          }
        }
      if (count == 2) {
        if(k%2==0){
          System.out.println(i*i);
        }
        k++;
      }
      count=0;
    }
   }
}
