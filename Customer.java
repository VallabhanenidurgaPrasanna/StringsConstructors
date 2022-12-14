import java.util.Scanner;

class Cust {
  private int cid;
  private String cname;
  private String cadd;
  private long phnno;

  // setters
  void setCid(int cid) {
    this.cid = cid;
  }

  void setCname(String cname) {
    this.cname = cname;
  }

  void setCadd(String cadd) {
    this.cadd = cadd;
  }

  void setPhnno(long phnno) {
    this.phnno = phnno;
  }

  // getters
  int getCid() {
    return cid;
  }

  String getCname() {
    return cname;
  }

  String getCadd() {
    return cadd;
  }

  long getPhnno() {
    return phnno;
  }
}

public class Customer {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value");
    int n = sc.nextInt();
    Cust c[] = new Cust[n];
    for (int i = 0; i < n; i++) {
      c[i] = new Cust();
      System.out.println("enter" + i + "customer details");
      c[i].setCid(sc.nextInt());
      c[i].setCname(sc.next());
      c[i].setCadd(sc.next());
      c[i].setPhnno(sc.nextLong());
      System.out.println(c[i].getCid() + " " + c[i].getCname() + " " + c[i].getCadd() + " " + c[i].getPhnno());
    }
  }
}