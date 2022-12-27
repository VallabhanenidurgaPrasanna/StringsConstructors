import java.util.*;
public class SReverse{
  public void Re(){
   String str="Hi welcome to java";
  StringTokenizer st = new StringTokenizer(str);
  while(st.hasMoreTokens()){
  //System.out.println(st.nextToken()); 
  
  StringBuffer sb=new StringBuffer(st.nextToken());
    sb.reverse();
    System.out.println(sb);
  }
  }
   public static void main(String args[]){
   SReverse r=new SReverse();
     r.Re();
  }
}
