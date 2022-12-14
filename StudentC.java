
/*Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same 
name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes
 has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 
10 students.
Hint - Use array of objects*/
import java.util.*;

class StudentC {
  String name;
  int age;
  String address;

  StudentC() {

  }

  StudentC(String name, int age, String address) {
    this.name = "unknown";
    this.age = 0;
    this.address = "not available";
  }

  public void setInfo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setInfo(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value");
    int n = sc.nextInt();
    StudentC s[] = new StudentC[n];
    for (int i = 0; i < n; i++) {
      s[i] = new StudentC();
      System.out.println("Enter student Details");
      // System.out.println("enter name");
      s[i].setInfo(sc.next(), sc.nextInt());
      s[i].setInfo(sc.next(), sc.nextInt(), sc.next());
      System.out.println(s[i].name + " " + s[i].age);
      System.out.println(s[i].name + " " + s[i].age + " " + s[i].address);
    }
  }
}