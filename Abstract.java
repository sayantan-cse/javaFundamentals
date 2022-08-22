package practice;
//Abstraction is for reducing complexity
//Abstract class cant create object



public abstract class Abstract {
    String name;
    //abstract method only has signature
    // dont have body
    
    public abstract void isAbstract();
    
    
}

class ChildAbstract extends Abstract{

    @Override
    public void isAbstract() {
        System.out.println("Implementing abstract method");
        
    }
}
