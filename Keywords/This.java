class Father{
    int age;
    char gender;
   
}
class Son extends Father{
    void print(char gender,int age){
        this.gender=gender;
        this.age=age;
    }
}

public class This {
    public static void main(String[] args) {
        Son s=new Son();
        s.print('M',50);
        System.out.println(s.age);
        System.out.println(s.gender);
      
       
    }
}



