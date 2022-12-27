//Student Comparable
import java.util.*;
class StudentCom{
  public static void main(String args[]){
  ArrayList<Student> list=new ArrayList<Student>();
 
    
    list.add(new Student(123,"prasanna"));
    list.add(new Student(345,"chanti"));
    list.add(new Student(567,"Durga"));
    list.add(new Student(789,"sai"));
    Collections.sort(list);
    
      for(Student std:list)
        System.out.println(std.name+" "+std.rollno);
      }
   
  }
 
class Student implements Comparable<Student>{
  int rollno;
  String name;
  Student(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
  }
  // public int compareTo(Student st){
  //   if(rollno==st.rollno)
  //     return 0;
  //   else if(rollno>st.rollno)
  //     return 1;
  //   else
  //     return -1;
    
  // }
  public int compareTo(Student st){
    return name.compareTo(st.name);
}
}