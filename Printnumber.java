/*
 * 3.Create a class named 'PrintNumber' to print various numbers of different
 * datatypes by creating different methods with the same name 'printn' having a
 * parameter for each datatype.
 */

class Printnumber {
  void printn(int a) {
    System.out.println(a);
  }

  void printn(float a, int b) {
    System.out.println(a + b);
  }

  void printn(float a, int b, int c) {
    System.out.println(a + b);
  }

  public static void main(String args[]) {
    Printnumber p = new Printnumber();
    p.printn(12);
    p.printn(1.0f, 20);
    p.printn(1.0f, 20, 40);
  }
}