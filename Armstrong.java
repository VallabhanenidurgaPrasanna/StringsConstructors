import java.util.Scanner;

public class Armstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter armstrong number");
    int num = sc.nextInt();
    int rem = 0, count = 0, temp = num, pow = 1, sum = 0;
    while (num != 0) {
      num = num / 10;
     count++;
    }
    num = temp;
    while (num != 0) {//121
      rem = num % 10;//1
      for (int i = 1; i <= count; i++) {
        pow = pow * rem;
     }
      sum = sum + pow;
      num = num / 10;
      pow = 1;
      
    }
    System.out.println("sum is" +sum);
    if (sum == temp) {
      System.out.println("armstrong number");
    } else {
      System.out.println("not an armstrong number");
    }
  }
}