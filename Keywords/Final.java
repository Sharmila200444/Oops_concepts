import Inheritance.Father;
import Inheritance.Son;

class Father{
    final int age=50;
    char gender='M';
    final void print(){
        System.out.println("parentclass");
    }
}
class Son extends Father{
   
}

public class Final {
    public static void main(String[] args) {
        Son s=new Son();
        System.out.println(s.age);
        s.age=30; 
        //once we declare as final keyword we can not assign another value or modify the another value//
        System.out.println(s.age);
       
    }
}

    

