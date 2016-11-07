package tw.org.iii.javatest;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java33 {
    public static void main(String[] args){
        try {
            FileOutputStream fout = new FileOutputStream("dir1/file3",true);

            fout.write("Hello, Java,\n".getBytes());
            fout.flush();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

