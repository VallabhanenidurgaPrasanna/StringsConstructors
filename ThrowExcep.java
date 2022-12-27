import java.util.*;

public class ThrowExcep {
  public static void Validateage(int age) {
    if (age > 18) {
      System.out.println("valid");
    } else {
      throw new NumberFormatException("invalid");
    }
  }

  public static void main(String args[]) {
    try {
      Validateage(12);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

/*
import java.util.*;
class Demo{
 
  public static void mobileValidation(String mobile){
    if(mobile.length()==10){
      System.out.println("Vaild mobile number");
    }
    else{
      throw new ArithmeticException("Invalid Mobile number");
    }
  }
  public static void main(String args[]){
try{
    mobileValidation("986756342");
}
catch(Exception e){
// e.printStackTrace();
  System.out.println(e.getMessage());
}
  
    
    
  }
}*/