
// Write a JAVA program to find second largest element in an array.
import java.util.*;

class SecondLargest {
  public int secondLarge(int ar[]) {
    int max = ar[0];

    for (int i = 0; i < ar.length; i++) {
      for (int j = i + 1; j < ar.length; j++) {
        if (ar[i] > max) {
          max = ar[i];
          ar[i] = ar[j];
          ar[j] = max;

        }
      }

    }
    return max;
  }

  public static void main(String[] args) {
    SecondLargest sl = new SecondLargest();
    int a[] = { 12, 23, 34, 56 };
    int maximum = sl.secondLarge(a);
    System.out.println(maximum);
  }
}