/*
 * .Create a class named 'Member' having the following members: Data members 1 -
 * Name 2 - Age 3 - Phone number 4 - Address 5 - Salary It also has a method
 * named 'printSalary' which prints the salary of the members. Two classes
 * 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
 * 'Manager' classes have data members 'specialization' and 'department'
 * respectively. Now, assign name, age, phone number, address and salary to an
 * employee and a manager by making an object of both of these classes and print
 * the same.
 */
class Member {
  String name;
  int age;
  long phnno;
  String address;
  int salary;

  void PrintSalary() {
    System.out.println(salary);
  }
}

class Employee extends Member {
  String specialization;
  String department;
}

class Manager extends Member {
  String specialization;
  String department;
}

public class Example11 {
  public static void main(String args[]) {
    Employee emp = new Employee();
    emp.name = "Prasanna";
    emp.age = 22;
    emp.phnno = 123456789;
    emp.address = "vij";
    emp.salary = 10000;
    emp.specialization = "B.Tech";
    emp.department = "IT";
    System.out.println(emp.name + " " + emp.age + " " + emp.phnno + " " + emp.address + " " + emp.salary + " "
        + emp.specialization + " " + emp.department);
    emp.PrintSalary();
    Manager m = new Manager();
    m.name = "durga";
    m.age = 22;
    m.phnno = 987654321;
    m.address = "hyd";
    m.salary = 20000;
    m.specialization = "M-tech";
    m.department = "ECE";
    System.out.println(m.name + "" + m.age + " " + m.phnno + " " + m.address + " " + m.salary + " " + m.specialization
        + " " + m.department);
    m.PrintSalary();
  }
}