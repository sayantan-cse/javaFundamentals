// Java8
//Functional Interface
//Interface with exactly one abstract method
//we know we cant object of interface
//in java 8 we cann add concrete function to interface
//using default keyword


interface FunctiInter{
  
  //abstract method
  //only signature
  //no definition
  public abstract int add(int x, int y);
  public default void show()
  {
    System.out.println("i am default method in an interface");
  }
}

class Main{
  public static void main(String[] args){
    
    // howerver in java8
    //we can create object of interface
    //with lambda expression
    
    FunctiInter fi = (int x, int y ) -> {return (x+y);};
    
    int result = fi.add(3,9);
    System.out.println(result);
