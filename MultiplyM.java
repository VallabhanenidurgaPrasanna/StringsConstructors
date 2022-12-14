public class MultiplyM {
  boolean b = false;

  public boolean multiple(int i) {

    if ((i % 5 == 0) && (i % 11 == 0)) {
      b = true;
    }
    return b;
  }

  public static void main(String args[]) {
    MultiplyM obj = new MultiplyM();
    boolean b = obj.multiple(50);
    if (b) {
      System.out.println("the number is divisible by 5 and 11");
    } else {
      System.out.println("the number is not divisible by both 5 and 11");
    }
  }
}
