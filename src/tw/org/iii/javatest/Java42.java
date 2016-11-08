package tw.org.iii.javatest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Java42 {
    public static void main(String[] args) {

            try {
                Socket socket = new Socket(InetAddress.getByName("10.2.24.106"), 9999);
                socket.close();
                System.out.println("ok");
            } catch (Exception e) {}
        }
    }
