package Inheritance;
interface Father{
    abstract void walk();
    abstract void eat();
}
interface Mother{
    abstract void walk();
}
public class Multiple implements Father {

    public void walk(){
        System.out.println("walking");
    }
    public void eat(){
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Multiple obj=new Multiple();
        obj.walk();
        obj.eat();
    }
    
}
