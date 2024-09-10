import java.io.File;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args){
        try {
            File f=new File("Example.txt");
            Scanner s=new Scanner(f);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       

    }
    
    
}
