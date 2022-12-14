
import java.util.Scanner;

public class StringBB {

  public static void main(String args[]) {

    StringBuffer sb = new StringBuffer("hi");
    sb.append("hello");
    System.out.println("StringBuffer: " + sb);

    String str = new String("hi");
    str.concat("hello");
    System.out.println("String : " + str);

    StringBuilder sb1 = new StringBuilder("hi");
    sb1.append("hello");
    System.out.println("StringBuilder: " + sb1);

  }
}
