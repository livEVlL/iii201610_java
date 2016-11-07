package tw.org.iii.javatest;
// Exception ：例外/異常
public class Java28 {
    public static void main(String[] args){
        int a = 10, b = 0;
        int[] d = {0,1,2,3};
        try{
            System.out.println(d[4]);
            int c =a/b;
        }catch (RuntimeException ae) {
            System.out.println("yo");
        }

        System.out.println("OK");
    }
}
