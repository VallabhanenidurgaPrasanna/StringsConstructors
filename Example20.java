/*
 * .write a program student class id,name,marks,grade and branch using different
 * paramterized constrctor
 */
class Student4{
  int sid;
  String sname;
  int smarks;
  char sgrade;
  String sbranch;
  Student4(){
    sid=123;
    sname="Prasanna";
    smarks=480;
    sgrade='A';
    sbranch="IT";
  } 
  Student4(int id,String name,int marks,char grade,String branch){
    this.sid=id;
    this.sname=name;
    this.smarks=marks;
    this.sgrade=grade;
    this.sbranch=branch;
  }
  Student4(int sid,int smarks){
    this.sid=sid;
    this.smarks=smarks;
  }
  }


class Example20{
  public static void main(String args[]){
    Student4 s=new Student4();
    System.out.println(s.sid);
    System.out.println(s.sname);
    System.out.println(s.smarks);
    System.out.println(s.sgrade);
    System.out.println(s.sbranch);
    Student4 s1=new Student4(2558,"Prasanna",480,'B',"ECE");
    System.out.println(s1.sid+" "+s1.sname+" "+s1.smarks+" "+s1.sgrade+" "+s1.sbranch);
    Student4 s2=new Student4(465,550);
    System.out.println(s2.sid+" "+s2.smarks);
    
    
  }
       
  }   