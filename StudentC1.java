// you can create object and you can perform operation
import java.util.*;
class Student{
  int rollno;
  int marks;
  String name;
  String grade;
  // constructor
  Student(int rollno,int marks,String name, String grade){
    this.rollno=rollno;
    this.marks=marks;
    this.name=name;
    this.grade=grade;
    
  }
}
interface StudentDao{
  public void insertStudent(ArrayList<Student> a);
  public void serachStudent(ArrayList<Student> a,int rollno);
  public void displayStudent(ArrayList<Student> a);
  public void updateStudent(ArrayList<Student> a,int rollno);
  public void deleteStudent(ArrayList<Student> a,int rollno);
  public void viewOptions();
}
 
class StudentDaoImpl implements StudentDao{
   public void viewOptions() {
               
        System.out.println("1. Insert");
        System.out.println("2. Search");
        System.out.println("3. Display");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("0. EXIT");
   }
  public void insertStudent(ArrayList<Student> a){
   
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Student details");
      a.add(new Student(sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
    if(a.isEmpty()){
     System.out.println("not inserted");
   }
    else{
      System.out.println("inserted succesfully");
    }
    // for(Student obj:a){
    //   System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
    // }
  }
  public void serachStudent(ArrayList<Student> a,int rollno){
    for(Student obj:a){  
      if(obj.rollno==rollno){ //1==2
         System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
      }
      else{
        System.out.println("roll not matched");
      }
    }
  }
   public void displayStudent(ArrayList<Student> a){
     for(Student obj:a){
        System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
     }
   }
  public void updateStudent(ArrayList<Student> a,int rollno){
    for(Student obj:a){
      if(obj.rollno==rollno){
        obj.marks=400;
        System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
      }
      else{
        System.out.println("Record not matched");
      }
    }
  }
  public void deleteStudent(ArrayList<Student> a,int rollno){
    Student std=null;
    for(Student obj:a ){
      if(obj.rollno==rollno){  //4==4,
        std=obj;//4
      }
      
    }
    if(std==null){ // 4==4;
        System.out.println("invalid");
      }
      else{
        a.remove(std);//4 index value
        System.out.println("Deleted ");
      }
  }                //[0,1,2,3,4]
}

 

class Student1{
  public static void main(String args[]){
    // Student ss=new Student(1,300,"Amit","B");//0
    // Student sa=new Student(2,700,"Amit1","Z");//1
    // Student sb=new Student(3,600,"Amit2","D");//2
    // Student sc=new Student(4,500,"Amit3","A");//3
    // Student sd=new Student(5,400,"Amit4","c");//4
    // Student se=new Student(4,650,"shwetha","E");//5
    
    StudentDao s1= new StudentDaoImpl();  
    ArrayList<Student> a1=new ArrayList<Student>();
    // a1.add(ss);
    // a1.add(sa);
    // a1.add(sb);
    // a1.add(sc);
    // a1.add(sd);
    // a1.add(se);
    int option=0;
    do{
      s1.viewOptions();
    System.out.println("Choose your option");
        Scanner s=new Scanner(System.in);
        option=s.nextInt();
    
        if(option==1) {
            s1.insertStudent(a1);
        }
        else if(option==2) {
            
            s1.serachStudent(a1,2);
            
        }
        else if(option==3) {
            s1.displayStudent(a1);
        }
       else if(option==4) {
            s1.updateStudent(a1,3);
        }
       else if(option==5) {
            s1.deleteStudent(a1,4);
        }
        else if(option==0) {
            System.out.println("Thank you");
        }
        }
        while(option!=0);
    
    
    // s1.insertStudent(a1);
    // s1.serachStudent(a1,2);
    // s1.displayStudent(a1);
    // s1.updateStudent(a1,2);
    // s1.deleteStudent(a1,4);
    // s1.displayStudent(a1);
  }
}