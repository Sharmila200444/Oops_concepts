class Father{
    int age=50;
    char gender='M';
    void print(){
        System.out.println("parentclass");
    }
}
class Son extends Father{
   void print(){
    System.out.println("childclass");
    super.print();
   }
}

public class Super {
    public static void main(String[] args) {
        Son s=new Son();
        s.print();  
       
    }
}

//by using super keyword we dirctly access the parent class//


    
