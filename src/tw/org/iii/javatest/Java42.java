package tw.org.iii.javatest;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

// Client端
public class Java42 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

            try {
                Socket socket = new Socket(InetAddress.getByName("10.2.24.123"), 9999);

                OutputStream out = socket.getOutputStream();
                FileInputStream fin = new FileInputStream("dir1/pk.jpg");

                int b;
                while ( (b = fin.read())!= -1){
                    out.write(b);
                }
                fin.close();
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
