import java.util.Scanner;
public class MaxArray{

    public static void main(String args[]) {
             
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();  
     int arr[]=new int[n];
    System.out.println("Enter "+n+" values");
    int max=s.nextInt();
    for(int i=1;i<arr.length;i++) {
         arr[i]=s.nextInt();
        if(max<arr[i]) {  
            max=arr[i];    
        }
    }
    
    System.out.println("Max value: "+max);
      
        
    
    }

}