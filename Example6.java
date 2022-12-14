// 6.Create a class 'Degree' having a method 'getDegree' that prints "I got a
// degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each
// having a method with the same name that prints "I am an Undergraduate" and "I
// am a Postgraduate" respectively. Call the method by creating an object of
// each of the three classes.*/

class Degree {
  void getdegree() {
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree {
  void getdegree() {
    System.out.println("I am an undergraduate");
  }
}

class Postgraduate extends Degree {
  void getdegree() {
    System.out.println("I am a Postgraduate");
  }

}

public class Example6 {
  public static void main(String args[]) {
    Degree d = new Degree();
    d.getdegree();
    Undergraduate ug = new Undergraduate();
    ug.getdegree();
    Postgraduate pg = new Postgraduate();
    pg.getdegree();
  }
}
