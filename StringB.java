import java.util.Scanner;
public class StringB {
        public static void main(String args[]){
         
            StringBuffer str=new StringBuffer("welcome to bitLabs");
            StringBuffer sb=new StringBuffer();
            for(int i=str.length()-1;i>=0;i--) {
                sb.append(str.charAt(i)+" ");
            }
            System.out.println(sb);
        }
        }