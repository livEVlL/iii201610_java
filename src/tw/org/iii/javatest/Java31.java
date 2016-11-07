package tw.org.iii.javatest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Java31 {
    public static void main(String[] args){
        try {

            FileInputStream fin =
                    new FileInputStream("dir1/file1");
            byte[] buf = new byte[5]; int len;
            while ((len = fin.read(buf) )!= -1){
                System.out.print(new String(buf, 0,len));
            }


            fin.close();
        } catch (IOException e) {

        }
    }
}
