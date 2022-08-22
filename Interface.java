package practice;

//interface provides true abstraction
//alternative to multiple inheritance

interface Person{
    
    //only contains abstract method
    // cant contain concrete method
    public abstract void isPerson();
}

interface Livingbeing{
    public abstract void isLiving();
}

//allows multiple implementation
class Sayantan implements Person,Livingbeing{

    @Override
    public void isPerson() {
        System.out.println("yes");  
    }

    @Override
    public void isLiving() {
        System.out.println("yes");

    }
}
