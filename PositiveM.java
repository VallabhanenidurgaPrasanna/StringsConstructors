public class PositiveM {
  public boolean P1(int num) {
    boolean a = false;
    if (num > 0) {
      a = true;
    }
    return a;
  }

  public static void main(String args[]) {
    PositiveM obj = new PositiveM();
    boolean a = obj.P1(-20);

    if (a) {
      System.out.println("positive number");
    } else {
      System.out.println("not positive number");

    }
  }
}