
class Sample{
    int roll;
    int marks;

    public void display(){
        System.out.println(roll);
        System.out.println(marks);
    }

Sample(){
    
}
}
public class Default {
    public static void main(String[] args){
        Sample obj=new Sample();
        obj.roll=44;
        obj.marks=100;
        obj.display();
    }
    
}
