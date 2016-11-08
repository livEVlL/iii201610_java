package tw.org.iii.javatest;

public class Java35 {
 public static void main(String[] args){
     Java353 obj1 = new Java353();
 }
}
class Java351{

    static {
        System.out.println("Java351:static{...}");
    }
    {
        System.out.println("Java351:{....}:a=");
    }
    Java351(){System.out.println("Java351");}
    void m1(){System.out.println("Java351: m1()");}
    static void m2(){System.out.println("Java351:m2()");}
}
class Java352 extends Java351{
    static {
        System.out.println("Java352:static{...}");
    }
    {
        System.out.println("Java352:{....}:a=");
    }
    Java352(){System.out.println("Java352");}
    void m1(){System.out.println("Java352: m1()");}
    static void m2(){System.out.println("Java352:m2()");}
}
class Java353 extends Java352{
    static {
        System.out.println("Java353:static{...}");
    }
    {
        System.out.println("Java353:{....}:a=");
    }
    Java353(){System.out.println("Java353");}
    void m1(){System.out.println("Java353: m1()");}
    static void m2(){System.out.println("Java353:m2()");}
}