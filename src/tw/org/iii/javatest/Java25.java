package tw.org.iii.javatest;

public class Java25 {
    public static void main(String[] args){
        Java251 obj1 = new Java251();
        Java252 obj2 = new Java253();
        Java252 obj3 = new Java254();
        obj2.m2();
        obj3.m2();

    }
}
class Java251{
    int a ;
    void m1(){}
}

abstract class  Java252{
    int a;
    void m1(){}
    abstract void m2();
}
class Java253 extends Java252{
    void m2(){System.out.println("YA!");}
}
class Java254 extends Java252{
    void m2(){System.out.println("yo!yo!yo!");}
}