//WAP to search all occurrences of a character in given string.
import java.util.Scanner;
public class AllOccurence
{
  public void occurence(){
    
    Scanner sc=new Scanner(System.in);
     int count=0,count1=0;
    System.out.println("Enter string");
    String str=sc.nextLine();
   System.out.println("Enter search element");
    char ch=sc.nextLine().charAt(0);
    for(int i=0;i<str.length();i++){
      if((str.charAt(i)==ch)){
          count++;
      }
      }
     System.out.println(count);
  }
  public static void main(String args[]){
  AllOccurence a=new AllOccurence();
    a.occurence();
  }
}