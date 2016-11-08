package tw.org.iii.javatest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Java37 {
    public static void main(String[] args){
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream("dir1/lab01.oo"));
            Object obj = oin.readObject();
            Student s2 = (Student) obj;

            oin.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
