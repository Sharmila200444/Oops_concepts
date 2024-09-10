
class Sample{
    int roll;
    int marks;
     
    
    public void display(){
        System.out.println(roll);
        System.out.println(marks);
        }

    Sample(int a, int b){
        roll=a;
        marks=b;

    }
}
public class Parameterized {
    public static void main(String[] args){
        Sample obj=new Sample(50,98);
        obj.display();
    }

    
}
