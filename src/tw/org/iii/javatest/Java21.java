package tw.org.iii.javatest;

public class Java21 {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = new String();
        byte[] b1 = {97,98,99,100};
        String s3 = new String(b1);
        String s4 = new String(b1,1,2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
