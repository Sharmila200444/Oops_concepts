import Mother;

package Inheritance;
class GrandFather{
    int age=45;
    char gender='M';
}

class Mother extends GrandFather{
   
    char gender='F';
}
class Son extends Mother{

}
public class Multilevel {
    public static void main(String[] args){
        Son obj=new Son();
        System.out.println(obj.gender);
        System.out.println(obj.age);
}

    }
    
