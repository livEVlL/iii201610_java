package tw.org.iii.javatest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Java41 {
    public static void main(String[] args){
        String message = "";
        byte[] data = message.getBytes();
        try {
            DatagramSocket socket =
                    new DatagramSocket();
            DatagramPacket packet =
                    new DatagramPacket(data,data.length,
                            InetAddress.getByName("10.2.24.106"),8888);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
