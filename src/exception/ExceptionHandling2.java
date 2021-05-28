package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] argv) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e);
            return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally 다음은 항상 수행되지롱");
        }
        System.out.println("여기가 끝이다.");
    }
}
