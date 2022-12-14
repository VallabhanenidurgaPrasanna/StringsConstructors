import java.util.Scanner;

class Emp {
  private int eid;
  private String ename;
  private long esal;
  private String eaddress;

  // setters
  void setEid(int eid) {
    this.eid = eid;
  }

  void setEname(String ename) {
    this.ename = ename;
  }

  void setEsal(long esal) {
    this.esal = esal;
  }

  void setEaddress(String eaddress) {
    this.eaddress = eaddress;
  }

  // getters
  int getEid() {
    return eid;
  }

  String getEname() {
    return ename;
  }

  long getEsal() {
    return esal;
  }

  String getEaddress() {
    return eaddress;
  }
}

public class Employee {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    int n=sc.nextInt();
    Emp e[]=new Emp[n];
    for(int i=0;i<n;i++){
      e[i]=new Emp();
      System.out.println("Enter employee details");
      e[i].setEid(sc.nextInt());
      e[i].setEname(sc.next());
      e[i].setEsal(sc.nextLong());
      e[i].setEaddress(sc.next());
      System.out.println(e[i].getEid()+" "+e[i].getEname()+" "+e[i].getEsal()+" "+e[i].getEaddress());
    }
  }
}