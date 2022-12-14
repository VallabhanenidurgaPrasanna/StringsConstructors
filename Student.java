import java.util.*;

class Stud {
  private int sid;
  private String sname;
  private int marks;
  private String grade;

  // setters
  void setSid(int sid) {
    this.sid = sid;
  }

  void setSname(String sname) {
    this.sname = sname;
  }

  void setMarks(int marks) {
    this.marks = marks;
  }

  void setGrade(String grade) {
    this.grade = grade;
  }

  // getters
  int getSid() {
    return sid;
  }

  String getSname() {
    return sname;
  }

  int getMarks() {
    return marks;
  }

  String getGrade() {
    return grade;
  }
}

public class Student {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value");
    int n = sc.nextInt();
    Stud s1[] = new Stud[n];
    for (int i = 0; i < n; i++) {
      s1[i] = new Stud();
      System.out.println("enter student details");
      s1[i].setSid(sc.nextInt());
      s1[i].setSname(sc.next());
      s1[i].setMarks(sc.nextInt());
      s1[i].setGrade(sc.next());
      System.out.println(s1[i].getSid() + " " + s1[i].getSname() + " " + s1[i].getMarks() + " " + s1[i].getGrade());

    }
  }
}