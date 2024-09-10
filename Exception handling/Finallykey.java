

public class Finallykey {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            System.out.println(a/b);
        } catch(Exception E){
            System.out.println("b is 0");
        }
        finally {
            System.out.println("Hello");
        }
        
    }
    
}
