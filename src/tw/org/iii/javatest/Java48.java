package tw.org.iii.javatest;

import java.io.File;
import java.io.IOException;

public class Java48 {
    public static void main(String[] atgs){
        try {
            MultipartUtility mu =
                    new MultipartUtility(
                            "http://127.0.0.1/untitled/Java02.php","utf-8");
            mu.addFilePart("upload",new File("upload/moon2.jpg"));
            mu.finish();
            System.out.println("upload OK");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
