//comparator
import java.util.*;
class StudentComp{
  public static void main(String args[]){
  ArrayList<Student> list=new ArrayList<Student>();
 
    
    list.add(new Student(123,"lalitha"));
    list.add(new Student(345,"Amit"));
    list.add(new Student(567,"Anitha"));
    list.add(new Student(789,"lavanya"));
    Collections.sort(list,new RollnoComparator());
    System.out.println("Sorting based on rollno");
    
      for(Student std:list){
        System.out.println(std.rollno+" "+std.name);
      }
 
      Collections.sort(list,new NameComparator());
     System.out.println("Sorting based on name");
      for(Student std:list){
        System.out.println(std.name+" "+std.rollno);
      }
   
  }
}
 
class Student {
  int rollno;
  String name;
  Student(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
  }
}
class RollnoComparator implements Comparator<Student>{
 
  public int compare(Student st1,Student st2){
    if(st1.rollno==st2.rollno)
      return 0;
    else if(st1.rollno>st2.rollno)
      return 1;
    else
      return -1;  
  }
  
}
class NameComparator implements Comparator<Student>{
  public int compare(Student st1,Student st2){
    return st1.name.compareTo(st2.name);
  }
}