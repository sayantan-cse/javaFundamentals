package practice;

public class Laptop {

    //nobody can access and change the value randomly
    private int ram;
    private int price;

    //setter
    public void setPrice(int price){
        boolean isAdmin=true;
        if (isAdmin) {
            this.price = price;
        }
        else{
            System.out.println("no access");
        }
    }
//    getter
    public int getPrice(){
        return price;
    }
}
