import java.util.Scanner;

public class Perfectn {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int sum, temp = num;
    for (int i = 0; i < num; i++) {
      sum=0;
      for (int j = 1; j <i; j++) {
        if (i % j == 0) {// 28
          sum = sum + j;
        }
      }
      if (sum == i && sum!=0) {
        System.out.println(i);
  }
}
  }
}