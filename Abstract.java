abstract class Sample{
    abstract void First();
    
    abstract void Second();
    void Third(){
        System.out.println("Thirdclass");
    }


}
class Case extends Sample{
    void First(){
        System.out.println("Firstclass");
    }
    void Second(){
        System.out.println("Secondclass");
    }
    

}
public class Abstract {
    public static void main(String[] args) {
        Case obj=new Case();
        obj.First();
        obj.Second();
        obj.Third();
    }
}
