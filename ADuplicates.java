import java.util.Scanner;
public class ADuplicates{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=s.nextInt();
    int a[]=new int[n];
     int i,j,k;
    int count;
    int fr1[]=new int[n];
    System.out.println("enter "+n+"values:");
    for(i=0;i<a.length;i++){
      a[i]=s.nextInt();
    }
  
    for(i=0;i<a.length;i++){
      count=1;
      for(j=i+1;j<a.length;j++){
      if( a[i]==a[j]){
        count++;
        fr1[j]=-1;
      }
      }
      if(fr1[i]!=-1){
      fr1[i]=count;
    }
    }
   
   
 
 
  for(i=0;i<n;i++){
  if(fr1[i]>1)
    {
    System.out.println("duplicate values are:" +a[i]+"");
    }
  }
 
}
}