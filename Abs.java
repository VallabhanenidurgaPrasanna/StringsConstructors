import java.util.*;

abstract class Stud {
  int id;
  String name;

  public void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter id");
    id = sc.nextInt();
    System.out.println("Enter name");
    name = sc.next();
  }

  public void display() {
    System.out.println(id + " " + name);

  }

  abstract void grade();
}

class Student1 extends Stud {

  public void grade() {
    int marks = 23;
    if (marks > 90) {
      System.out.println("GRADE A");
    } else if (marks > 80 && marks < 90) {

      System.out.println("GRADE B");
    } else {
      System.out.println("fail");
    }
  }
}

class Abs {
  public static void main(String args[]) {
    Stud std = new Student1();
    std.read();
    std.display();
    std.grade();
  }
}