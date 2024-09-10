class Father{
    static int age=50;
    char gender='M';
}
class Son extends Father{
    
}

public class Static {
    public static void main(String[] args) {
        System.out.println(Father.age);
        Son.age=30;
        System.out.println(Son.age);
        System.out.println(Father.age);
    }
}


//by using static keyword we dont have to create an object to access the class..it direatly Access the class //
