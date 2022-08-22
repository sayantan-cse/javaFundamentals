//OOP
// package sayantan;

public class Main{

  //main method has static keyword 
  //it doesnt need object instantiation to be executed
 public static void main(String[] args){

   //instantiating object
   Person p1 = new Person(28,"sayantanbhaumiktheworldfamoushuman");

   // when the new object is created
   //default constructor is called
   Person p2 = new Person();
   
   System.out.println(p1.name + " " + p1.age);

   // method overloading is compile time polymorphism
   //why compiletime?
   //because if you click on the method signature 
   // it shows which method the object is calling 
   //without running the program i.e. with in compiler
   
   p1.eat();
   p1.eat("Ghee");

   //static attribute accessed with classname only
   System.out.println(Person.countOfPerson);

   Engineer eng1 = new Engineer(28,"SayantanBhaumik");

   //runtime polymorphism
   //we get to only in runtime which eat() is invoked
   eng1.eat();
   
 }
}


//class =  blu print for objects

class Person {

  //attributes
  int age;
  String name;

  //static keyword makes this attribute accessible without
  //creating object
  static int countOfPerson;

  //construcors are used to create objects
  // default constructor without arguments
  public Person(){
    
    System.out.println("I am in the constructor");
    countOfPerson++;
  }

  //constructor overloading
  public Person(int age, String name){

    //this keyword is being used to call default constructor 
    //implementation from parameterised constructor
    this();

    // another use of this 
    //if class attribute name and argument name is same
    // this keyword diffrentiates class attributes from argument
    
    this.age=age;
    this.name=name;
    
   
  }

  //method
  public void eat(){
    System.out.println(name + "is eating");
  }

  //method overloading
  public void eat(String dish){
    System.out.println(name + "is eating" + dish);
  }
}

//inheritance
//creating child class of Person class

class Engineer extends Person{
  public  Engineer(int age, String name ){

    //super keyword invokes constructor of parent class
    super(age,name);
    
    
  }

  //method overriding
  //redefining the eat() of parent class in child class
  public void eat(String name){
    System.out.println("Engineer" +name+ " is eating");
    
  }
}
