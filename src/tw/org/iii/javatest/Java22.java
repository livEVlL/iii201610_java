package tw.org.iii.javatest;

import javax.sound.midi.SysexMessage;

public class Java22 {
    public static void main (String[] args){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println("-----");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1.equals(p2));
        System.out.println("-----");
        String s5 =s3;
        System.out.println(s3.concat("III"));
        System.out.println("-----");
        System.out.println(p1);
        System.out.println(p2);

    }
}
class Pen extends Object {
    @Override
    public String toString(){
        return "Apple";
    }
    @Override
    public boolean equals(Object obj){
        return true;
    }
}