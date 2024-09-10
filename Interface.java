interface Father{
    abstract void walk();
    abstract void eat();
}

public class Interface implements Father {

    public void walk(){
        System.out.println("walking");
    }
    public void eat(){
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.walk();
        obj.eat();
    }
    
}
