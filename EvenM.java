public class EvenM {
  public boolean even(int num) {
    boolean b = false;
    if (num % 2 == 0) {
      b = true;
    }
    return b;
  }

  public static void main(String args[]) {
    EvenM obj = new EvenM();
    boolean b = obj.even(11);
    if (b) {
      System.out.println("even number");
    } else {
      System.out.println("odd number");
    }
  }
}