package tw.org.iii.javatest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java32 {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("dir1/file1");
            int c;
            while ((c = reader.read())!= -1){
                System.out.print((char)c);
            }

        } catch (IOException e) {

        }
    }
}
