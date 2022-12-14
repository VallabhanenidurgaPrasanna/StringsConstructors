/*
 * .student class rollno,name,grade,branch and mobilenumber and print some
 * method.
 */
class Student1 {
  int rollno;
  String name;
  char grade;
  String branch;
  long mobileno;

  void read() {
    System.out.println(name + " reading");
  }

  void write() {
    System.out.println(name + " Writing");
  }

  void listen() {
    System.out.println(name + " Listening");
  }
}

class Example17 {
  public static void main(String args[]) {
    Student1 std1 = new Student1();
    std1.rollno = 897;
    std1.name = "Prasanna";
    std1.grade = 'B';
    std1.branch = "IT";
    std1.mobileno = 123456789;
    std1.read();
    std1.write();
    std1.listen();
    System.out.println(std1.rollno + " " + std1.name + " " + std1.grade + " " + std1.branch + " " + std1.mobileno);
  }
}