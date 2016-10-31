package tw.org.iii.javatest;

/**
 * Created by iii-user on 2016/10/31.
 */
public class Java07 {
    public  static void main (String[] args){
        System.out.println(1 ^ 3);
        int a = 10, b = 3;
        if(a++ <= 10 & b-- >= 3){
            System.out.println("ok:a = " + a +" ,b = "+ b);
        }else{
            System.out.println("XX:a" + a + ",b ="+ b);
        }
    }
}
