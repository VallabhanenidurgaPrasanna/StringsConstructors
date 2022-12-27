import java.util.*;
class Student1 {
  int rollno;
  String name;

  Student1(int rollno, String name) {
    this.rollno = rollno;
    this.name = name;
  }
}

public class StudentH {
  public static void main(String args[]) {
    HashMap<Integer, Student1> map = new HashMap<Integer, Student1>();
    map.put(1, new Student1(101, "Prasanna"));
    map.put(2, new Student1(102, "Durga"));
    map.put(3, new Student1(103, "Chanti"));
    for (Map.Entry m : map.entrySet()) {
      Student1 std = (Student1) m.getValue();
      System.out.println(m.getKey());
      System.out.println(std.rollno + " " + std.name);
    }

  }
}