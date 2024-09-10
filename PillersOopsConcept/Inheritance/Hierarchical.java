package Inheritance;
class Father{
    int age=50;
    char gender='M';

    void print(){
        System.out.println("Parent Class");
    }
}
class Daughter extends Father{
    int age=15;
    char gender='F';
}

class Son extends Father{
    int age=10;
    
}

public class Hierarchical {
    public static void main(String[] args) {
        Daughter D=new Daughter();
        System.out.println(D.age);
        System.out.println(D.gender);
        D.print();
        

        Son s=new Son();
        System.out.println(s.age);
        System.out.println(s.gender);
        s.print();
    
    }
}
   
// one parent class and many child class--hierarchical//    

