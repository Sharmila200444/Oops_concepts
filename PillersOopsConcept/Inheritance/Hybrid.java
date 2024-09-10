import Father;

package Inheritance;
class Father{
    int age=50;
    char gender='M';

    void print(){
        System.out.println("Parent Class");
    }
}
class Daughter extends Father{
    int age=30;
    char gender='F';
}

class Son extends Father{
    int age=10;
    
}

class GrandDaughter extends Daughter{
    void print(){
        System.out.println("Grandadughter");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Daughter D=new Daughter();
        System.out.println(D.age);
        System.out.println(D.gender);
        D.print();



        GrandDaughter G=new GrandDaughter();
        System.out.println(G.age);
        System.out.println(G.gender);
        G.print();
    }
    
}
