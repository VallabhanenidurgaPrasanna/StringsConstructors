/*
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth'
 * and two methods to print the area and perimeter of the rectangle
 * respectively. Its constructor having parameters for length and breadth is
 * used to initialize length and breadth of the rectangle. Let class 'Square'
 * inherit the 'Rectangle' class Print the area and perimeter of a rectangle and
 * a square.
 */

class Rectangle {
  int l;
  int b;

  Rectangle() {

  }

  Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }

  void area() {
    int f = l * b;
    System.out.println("area of rectangle" + f);
  }

  void perimeter() {
    int pf = 2 * (l + b);
    System.out.println("the perimeter of rectangle" + pf);
  }
}

class Square extends Rectangle {
  Square(int l) {
    this.l = l;
  }

  void area() {
    int f = l * l;
    System.out.println("area of Square" + f);
  }

  void perimeter() {
    int pf = 4 * l;
    System.out.println("the perimeter of Square" + pf);
  }

}

public class Example12 {
  public static void main(String args[]) {
    Rectangle r = new Rectangle(10, 20);
    r.area();
    r.perimeter();
    Square s = new Square(11);
    s.area();
    s.perimeter();
  }
}