package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] argv) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
             System.out.println(e);
             //return;
        }
        System.out.println("여기가 끝이다.");
    }
}
