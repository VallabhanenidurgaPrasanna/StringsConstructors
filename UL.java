import java.util.*;
public class UL{
  
  public void upperCase(){
     Scanner sc=new Scanner(System.in);
  System.out.println("Enter string");
  String str=sc.nextLine();
    System.out.println(str.toUpperCase());
  }
 public void lowerCase(){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter string");
  String str=sc.nextLine();
    System.out.println(str.toLowerCase());
  }
  public static void main(String args[]){
    UL ul=new UL();
    ul.upperCase();
    ul.lowerCase();
  }
}