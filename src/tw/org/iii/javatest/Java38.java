package tw.org.iii.javatest;

import java.io.*;

public class Java38 {
    public static void main (String[] args){
    //序列化
        Java383 obj =new Java383();
        try {
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/Java.o2"));
            oout.writeObject(obj);
            oout.flush();
            oout.close();
        } catch (Exception e) {}
            System.out.println("--------");

        //解序列化
        try {
            ObjectInputStream oin = new ObjectInputStream(
                    new FileInputStream("dir1/Java.o2"));
            Java383 obj3 = (Java383)oin.readObject();
            oin.close();
        } catch (Exception e) {}
    }
}
class Java381 implements Serializable{
    Java381(){System.out.println("Java381()");}
}
class Java382 extends Java381{
    Java382(){System.out.println("Java382()");}
}
class Java383 extends Java382 {
    Java384 obj;
    Java383(){obj= new Java384(); System.out.println("Java383()");}
}
class Java384 implements Serializable{}