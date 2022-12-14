import java.util.*;

class Product {
  private int pid;
  private String pname;
  private int pqty;
  private int price;

  // setters
  void setPid(int pid) {
    this.pid = pid;
  }

  void setPname(String pname) {
    this.pname = pname;
  }

  void setPqty(int pqty) {
    this.pqty = pqty;
  }

  void setPrice(int price) {
    this.price = price;
  }

  // getters
  int getPid() {
    return this.pid;
  }

  String getPname() {
    return this.pname;
  }

  int getPqty() {
    return this.pqty;
  }

  int getPrice() {
    return this.price;
  }
}

public class Demo1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value");
    int num = sc.nextInt();
    Product p[] = new Product[num];

    for (int i = 0; i < num; i++) {
      p[i] = new Product();
      System.out.println("enter product details");
      p[i].setPid(sc.nextInt());
      p[i].setPname(sc.next());
      p[i].setPqty(sc.nextInt());
      p[i].setPrice(sc.nextInt());
      System.out.println(p[i].getPid() + " " + p[i].getPname() + " " + p[i].getPqty() + " " + p[i].getPrice());
    }
  }
}