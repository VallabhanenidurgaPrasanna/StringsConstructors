public class WeekM {
  public void week(int ch) {
    if (ch == 1) {
      System.out.println("Sunday");
    } else if (ch == 2) {
      System.out.println("Monday");

    } else if (ch == 3) {
      System.out.println("Tuesday");

    } else if (ch == 4) {
      System.out.println("Wednesday");

    } else if (ch == 5) {
      System.out.println("Thursday");

    } else if (ch == 6) {
      System.out.println("Friday");

    } else if (ch == 7) {
      System.out.println("Staturday");

    } else {
      System.out.println("Invalid");

    }
  }

  public static void main(String args[]) {
    WeekM obj = new WeekM();
    obj.week(1);

  }
}