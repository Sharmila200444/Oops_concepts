
class Father{
     private String name;
    int roll;

    public void display(){
        System.out.println(name);
        System.out.println(roll);
    }
    public void setValue(String st,int n){
        name=st;
        roll=n;

    }
    public String getValue(){
        return name;
    }

}

public class Privateclass {
    public static void main(String[] args) {
        Father f=new Father();
        f.setValue("elumalai",72);
        String std=f.getValue();
        System.out.println(std);
        f.display();
        
    }
}
    

// if we want to access yhe private method there is 2 method --1.(seter), 2.(geter)

    

