package tw.org.iii.javatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

// Client端
public class Java44 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
            try {
                File source = new File("dir1/pk.jpg");
                byte[] buf = new byte[(int)source.length()];
                FileInputStream fin = new FileInputStream(source);
                fin.read(buf);
                fin.close();

                Socket socket = new Socket(
                        InetAddress.getByName("10.2.24.123"), 9999);
                OutputStream out = socket.getOutputStream();

                out.write(buf);
                out.flush();
                out.close();

//                BufferedOutputStream bout =
//                        new BufferedOutputStream(
//                                socket.getOutputStream());
//                bout.write("Hello,Java \n Hello,Word".getBytes());
//                bout.flush();
//                bout.close();

                socket.close();
                System.out.println("ok-------");
                System.out.println(System.currentTimeMillis()-start);
            } catch (Exception e) {}
        }
    }
