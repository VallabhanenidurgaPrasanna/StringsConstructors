/*write a program using super keyword in student class variable are id,name using paramterized constrcutor
and one more class employee class have extra variable salary using super and paramterized constructor*/

class Student {
  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  void display() {
    System.out.println(id + " " + name);
  }
}

class Employee extends Student {
  int sal;

  Employee(int id, String name, int sal) {
    super(id, name);
    this.sal = sal;
  }

  void display() {
    System.out.println(id + " " + name + " " + sal);
  }
}

public class Super {
  public static void main(String args[]) {
    Student s = new Student(1, "durga");
    s.display();
    Employee e = new Employee(1, "prasanna", 10000);
    e.display();

  }
}