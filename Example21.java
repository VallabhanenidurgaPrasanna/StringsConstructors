/*
 * animal class take some attaributes and extends one dog we can print
 * that.(single inheritance)
 */

class Animal{
  String name;
  String gender;
  String colour;
  void eat(){
    System.out.println("eating");
  }
  void run(){
    System.out.println("running");
  }
}

class Dog extends Animal{
 void bark(){
    System.out.println("Bow Bow......");
  }
  void display(){
    System.out.println(name +" "+gender+" "+colour);  
  }
}

public class Example21{
  public static void main(String args[]){
    Animal a=new Animal();
    Dog puppy=new Dog();
    puppy.name="snipy";
    puppy.gender="female";
     puppy.colour="black";
    puppy.display();
    puppy.eat();
    puppy.run();
    puppy.bark();
  }

  }
