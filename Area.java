/*2.Create a class to print the area of a square and a rectangle. The class has two methods with the same name but 
different number of parameters. The method for printing area of rectangle has two parameters which are length and 
breadth respetively while the other method for printing area of square has one parameter which is side of square.*/

class Area1 {
  void Rectangle(int l, int b) {
    System.out.println("area of rectangle is:" + (l * b));
  }

  void Square(int s) {
    System.out.println("area of square is:" + (s * s));
  }
}

class Area {
  public static void main(String args[]) {
    Area1 a = new Area1();
    a.Rectangle(10, 50);
    a.Square(8);
  }
}