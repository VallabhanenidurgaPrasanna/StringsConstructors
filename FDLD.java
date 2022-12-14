import java.util.Scanner;
public class FDLD{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    int ld=0;
    int fd=0;
    ld=num%10;
    while(num!=0){//124
      fd=num%10;
      num=num/10;
    }
    System.out.println("the first digit of a number is " + fd);
          System.out.println("the first digit of a number is " + ld);

    }
  }
