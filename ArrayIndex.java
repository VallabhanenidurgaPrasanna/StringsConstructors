//array index out of bonds

import java.util.*;
class ArrayIndex{
  public static void main(String args[]){
  int a[]={23,45,67,89};
    //ArrayIndexOutOfBoundsException:
    try{
    System.out.println(a[5]);
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("Exception handled");
  }
}