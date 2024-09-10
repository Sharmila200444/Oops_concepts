class Form{
    String name;
    int roll;

public void setValue(String st, int n){
    name=st;
    roll=n;
}

public void display(){
    System.out.println(name);
    System.out.print(roll);
}
}
public class ClassAndObject {
    public static void main(String[] args){
        Form a = new Form();
       a.setValue("coder",44);
    
        a.display();
 
       }   
    }

    

