public class MaxM {
  public void Big1(int a, int b) {
    if (a > b) {
      System.out.println("a is big" + a);
    } else {
      System.out.println("bigggest number is " + b);

    }
  }

  public int Big2(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c) {
      return b;
    } else {
      return c;
    }
  }

  public static void main(String args[]) {
    MaxM obj = new MaxM();
    int B = obj.Big2(10, 20, 30);
    System.out.println("biggest number is" + B);
    obj.Big1(10, 60);

  }
}