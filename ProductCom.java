//product comparable

import java.util.*;

class Product implements Comparable<Product> {
  int pid;
  String name;
  int price;

  Product(int pid, String name, int price) {
    this.pid = pid;
    this.name = name;
    this.price = price;
  }

  //public int compareTo(Product p) {
    //if (pid == p.pid) {
   //   return 0;
   // } else if (pid > p.pid) {
   //   return 1;
   // } else {
    //  return -1;
   // }
 // }

  public int compareTo(Product p){
    return name.compareTo(p.name);
  }
}

public class ProductCom {
  public static void main(String args[]) {
    ArrayList<Product> a = new ArrayList<Product>();
    a.add(new Product(1, "watch", 1200));
    a.add(new Product(2, "phone", 10000));
    a.add(new Product(33, "box", 15));
    a.add(new Product(12, "pen", 10));
    Collections.sort(a);
    for (Product pd : a) {
      System.out.println(pd.name + " " + pd.price + " " + pd.pid);
    }

  }
}