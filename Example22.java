
/*
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth'
 * and two methods to print the area and perimeter of the rectangle
 * respectively. Its constructor having parameters for length and breadth is
 * used to initialize length and breadth of the rectangle. Let class 'Square'
 * inherit the 'Rectangle' class Print the area and perimeter of a rectangle and
 * a square. Now repeat the above example to print the area of 10 squares.
 * Hint-Use array of objects
 */
import java.util.Scanner;

class Rect {
  int l;
  int b;

  Rect() {

  }

  Rect(int l, int b) {
    this.l = l;
    this.b = b;
  }

  void area() {
    int rf = l * b;
    System.out.println("area of rectangle" + rf);
  }

  void perimeter() {
    int pf = 2 * (l + b);
    System.out.println("the perimeter of a rectangle is " + pf);
  }
}

class Square extends Rect {
  int a;

  Square(int a) {
    this.a = a;
  }

  void area() {
    int c = a * a;
    System.out.println("area of square is:" + c);
  }

  void perimeter() {
    int p = 4 * a;
    System.out.println("perimeter of a square is " + p);
  }
}

public class Example22 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter count");
    int n = sc.nextInt();
    Rect r = new Rect(10, 20);
    r.area();
    r.perimeter();
    Square s[] = new Square[n];
    for (int i = 0; i < n; i++) {
      System.out.println("enter" + i + 1 + "details");
      int a = sc.nextInt();
      s[i] = new Square(a);
      s[i].area();
      s[i].perimeter();
    }

  }
}