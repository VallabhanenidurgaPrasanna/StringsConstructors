/*
 * write a program student class we take 3 subject mark .using parameterized
 * constructor print average in display method.
 */
class Student {
  int s1, s2, s3;

  Student(int s1, int s2, int s3) {
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  void display() {
    int avg = (s1 + s2 + s3 / 3);
    System.out.println("the avg marks of 3 subjects is" + avg);
  }
}

public class Example15 {
  public static void main(String args[]) {
    Student s = new Student(10, 20, 30);
    s.display();
  }
}