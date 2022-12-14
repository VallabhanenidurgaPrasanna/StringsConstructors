/*
 * take employee class attributes are id,name and salary using setter and getter
 * method.
 */

class Employee {
  private int id;
  private String name;
  private long sal;

  // setter
  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSal(long sal) {
    this.sal = sal;
  }

  // getter
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public long getSal() {
    return sal;
  }
}

public class Example24 {
  public static void main(String args[]) {
    Employee emp = new Employee();
    emp.setId(44);
    emp.setName("prasanna");
    emp.setSal(100000);
    System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());

  }
}
