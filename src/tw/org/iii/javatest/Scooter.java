package tw.org.iii.javatest;

public class Scooter extends Bike {
        Scooter(){
            // super() ; 隱含呼叫父值
            super(1);
            System.out.println("Scooter()");
        }
}
