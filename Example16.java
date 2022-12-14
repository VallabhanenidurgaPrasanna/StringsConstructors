/*
 * student class we have to take id,name,average and age using seeter and geeter
 * methods and parameterized constructor.
 */
class StudentData {
  private int stuid;
  private String stuName;
  private int stuAge;
  private float stuavg;

  StudentData() {
    // Default constructor
    stuid = 5;
    stuName = "New Student";
    stuAge = 18;
    stuavg = 82;
  }

  StudentData(int stuid, String stuName, int stuage, float stuavg) {
    // Parameterized constructor
    this.stuid = stuid;
    this.stuName = stuName;
    this.stuAge = stuAge;
    this.stuavg = stuavg;
  }

  // Getter and setter methods
  public int getStuID() {
    return stuid;
  }

  public void setStuID(int stuid) {
    this.stuid = stuid;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public int getStuAge() {
    return stuAge;
  }

  public void setStuAge(int stuAge) {
    this.stuAge = stuAge;
  }

  public float getStuavg() {
    return stuavg;
  }

  public void setStuavg(float stuavg) {
    this.stuavg = stuavg;
  }
}

public class Example16 {
  public static void main(String args[]) {

    StudentData myobj = new StudentData();
    System.out.println("Student Name is: " + myobj.getStuName());
    System.out.println("Student Age is: " + myobj.getStuAge());
    System.out.println("Student ID is: " + myobj.getStuID());
    System.out.println("Student average is: " + myobj.getStuavg());
    /*
     * This object creation would call the parameterized constructor
     * StudentData(int, String, int)
     */
    StudentData myobj2 = new StudentData(555, "Prasanna", 25, 85);

    System.out.println("Student Name is: " + myobj2.getStuName());
    System.out.println("Student Age is: " + myobj2.getStuAge());
    System.out.println("Student ID is: " + myobj2.getStuID());
    System.out.println("Student average is:" + myobj2.getStuavg());
  }
}