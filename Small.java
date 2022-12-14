//1.Method to find smallest number among 2 numbers 
//2.method to find smallest number among 3 numbers
//3.method to find smallest number among array of elements.

interface Smallestnumber {
  public void twosmall();

  public void threesmall();

  public void small();
}

class Smaller implements Smallestnumber {
  public void twosmall() {
    int a = 10, b = 20;
    if (a < b) {
      System.out.println("a is small");
    } else {
      System.out.println("b is small");
    }
  }

  public void threesmall() {
    int a = 10, b = 20, c = 30;
    if (a < b && a < c) {
      System.out.println("a is small");
    } else if (b < c && b < a) {
      System.out.println("b is small");
    } else {
      System.out.println("c is small");
    }
  }

  public void small() {
    int arr[] = { 10, 20, 15, 23, 30 };
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("smallest value of array is " + min);
  }
}

class Small {
  public static void main(String args[]) {
    Smallestnumber s = new Smaller();
    s.twosmall();
    s.threesmall();
    s.small();
  }
}