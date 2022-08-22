package practice;
//Abstraction is for reducing complexity
//Abstract class cant create object



public abstract class Abstract {
    String name;
    //abstract method only has signature
    // dont have body
    
    //abstarct class should contain atleast one abstarct method
    public abstract void isAbstract();
    
    //abstract class can contain concrete method
    public void show(){
         System.out.println("lala");
        
    
    
}

class ChildAbstract extends Abstract{

    @Override
    public void isAbstract() {
        System.out.println("Implementing abstract method");
        
    }
}
