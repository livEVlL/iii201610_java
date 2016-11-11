package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Java46 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://10.2.24.106");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line = br.readLine();
            br.close();

            InputStream in = conn.getInputStream();
            in.close();

            System.out.println(line);
            System.out.println("Finish");

        }catch(Exception e){

        }
    }
}