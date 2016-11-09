package tw.org.iii.javatest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// Server端
public class Java43 {
 public static void main(String[] args){
     try {
         ServerSocket server =
                 new ServerSocket(9999);
         System.out.println("Listening....");
         // Socket socket = sever.accept(); 同 server.accept();
         Socket socket = server.accept();
         socket.getInputStream();

         String urip = socket.getInetAddress().getHostAddress();

         FileOutputStream fout = new FileOutputStream("upload/"+ urip +".jpg");

         InputStream in = socket.getInputStream();
         int b ;
         while ( (b = in.read())!= -1){
             fout.write(b);
         }

         in.close();
         fout.flush();
         fout.close();

         server.close();
         System.out.println("Server OK");
     } catch (Exception e) {
     }
 }
}
