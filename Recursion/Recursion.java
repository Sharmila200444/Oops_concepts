

public class Recursion {
    public static void printnat(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            printnat(n-1);
        }
    }
    public static void main(String[] args){
        printnat(10);


    }
    
}
