package tw.org.iii.javatest;

import java.io.*;

public class Java34 {
    public static void main(String[] args) {
        try {
//            FileInputStream fin =
//                    new FileInputStream("dir1/file1");
//            InputStreamReader irs =
//                    new InputStreamReader(fin);
//            BufferedReader br =
//                    new BufferedReader(irs);
            //上下意義相同　
//            BufferedReader br =
//                    new BufferedReader(new BufferedReader
//                            (new InputStreamReader
//                                    (new FileInputStream("dir1/file1"))));

            // 實際做法不用多串一根管子　如下：
            BufferedReader br = new BufferedReader(
                    new FileReader("dir1/file1"));

            String line; int i =1;
            while ( (line = br.readLine())!= null){
                System.out.println(i++ + ">"+ line);
            }

            br.close();
        } catch (Exception e) {

        }
    }
}