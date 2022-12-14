import java.util.Scanner;

public class Stringreverse {
        public static void main(String args[]){
         
            StringBuffer str=new StringBuffer("welcome to bitLabs");
            StringBuffer sb=new StringBuffer();
            String words[]=str.toString().split(" ");
            
            for(int i=0;i<words.length;i++) {
                
                for(int j=words[i].length()-1;j>=0;j--) {   //welcome
                    sb.append(words[i].charAt(j));
                }
                sb.append(" ");
                
            }
            System.out.println(sb);
        }
        }
        
    