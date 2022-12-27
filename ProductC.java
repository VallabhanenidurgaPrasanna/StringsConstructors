import java.util.*;

class Product {
  int pid;
  String name;
  int qty;
  int price;

  Product(int pid, String name, int qty, int price) {
    this.pid = pid;
    this.name = name;
    this.qty = qty;
    this.price = price;
  }
}

interface ProductData {
  public void insert(ArrayList<Product> p);
  public void display(ArrayList<Product> p);
  public void update(ArrayList<Product> p,int pid);
  public void search(ArrayList<Product> p,int pid);
  public void delete(ArrayList<Product> p,int pid);
  public void viewOptions();
}

class ProductImp implements ProductData {
  public void viewOptions(){
    System.out.println("1.insert");
    System.out.println("2.display");
    System.out.println("3.update");
    System.out.println("4.search");
    System.out.println("5.delete");
    System.out.println("0.exit");
  }
  public void insert(ArrayList<Product> p) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter product1 details");
    p.add(new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()));// anonymous object
    System.out.println("enter product2 details");
    p.add(new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt()));
    if (p.isEmpty()) {
      System.out.println("not inserted");
    } else {
      System.out.println("inserted successfully");
    }
  }
  public void display(ArrayList<Product> p){
  for(Product obj:p){
    System.out.println(obj.pid+" "+obj.name+" "+obj.qty+" "+obj.price);
  }
  }
  public void update(ArrayList<Product> p,int pid){
    for(Product obj:p){
      if(obj.pid==pid){
        obj.name="samsung galaxy";
      }
      System.out.println(obj.name);
    }
  }
   public void search(ArrayList<Product> p,int pid){
     for(Product obj:p){
       if(obj.pid==pid){
         System.out.println(obj.pid+" "+obj.name+" "+obj.qty+" "+obj.price);
       }
     }
   }
  public void delete(ArrayList<Product> p,int pid){
  Product pd=null;
    for(Product obj:p ){
      if(obj.pid==pid){ 
        pd=obj;
      }
      
    }
    if(pd==null){ 
        System.out.println("invalid");
      }
      else{
        p.remove(pd);
        System.out.println("Deleted ");
      }
   } 
  }


public class ProductC {
  public static void main(String args[]) {
    ProductData pi = new ProductImp();
    Scanner sc=new Scanner(System.in);
    ArrayList<Product> list = new ArrayList<Product>();
   // pi.insert(list);
  //  pi.display(list);
    //pi.update(list,1);
   // pi.search(list,1);
   // pi.delete(list,1);
    // pi.display(list);
  int option=0;
 do{
   pi.viewOptions();
  option=sc.nextInt();
  System.out.println("choose your options");
  
  if(option==1){
    pi.insert(list);
  }
  else if(option==2){
    pi.display(list);
  }
  else if(option==3){
    pi.update(list,1);
  }
  else if(option==4){
    pi.search(list,1);
  }
  else if(option==5){
    pi.delete(list,1);
  }
  else if(option==0){
   System.out.println("thank you");
  }
  }while(option!=0);
  }
}