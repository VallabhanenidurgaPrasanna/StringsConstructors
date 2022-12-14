import java.io.*;
import java.util.Scanner;

public class Duplicatenumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value");
    int num = sc.nextInt();
    int arr[] = new int[num];
    System.out.println("enter" + num + "values");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {// 1 2 4
      int fr = 0, frcount = 0;
      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          fr++;
        }
      }
      if (fr == 1) {
        System.out.println("the duplicate values are" + arr[i]);
      }
    }
  }
}
