public class LeapM {
  public boolean years(int year) {
    boolean b = false;
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      b = true;
    }
    return b;
  }

  public static void main(String args[]) {
    LeapM obj = new LeapM();
    boolean b = obj.years(2016);
    if (b) {
      System.out.println("the leap year ");
    } else {
      System.out.println("not a leap year  ");

    }
  }
}