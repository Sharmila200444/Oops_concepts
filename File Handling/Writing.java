import java.io.File;
import java.io.FileWriter;

public class Writing {
    public static void main(String[] args){
        try {
            File f=new File("Example.txt");
            FileWriter w=new FileWriter(f);
            w.write("Welcome you all");
            w.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
       

    }
}
