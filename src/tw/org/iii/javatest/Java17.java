package tw.org.iii.javatest;
public class Java17 {
    public static void main(String[] args){
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        System.out.println(b1.getSpeed());
        b1.upSpeed();
        b1.upSpeed();
        b1.upSpeed();
        System.out.println(b1.getSpeed());
        System.out.println("------");

        System.out.println(b2.getSpeed());
        b2.upSpeed(2);
        b2.upSpeed(2);
        b2.upSpeed(2);
        System.out.println(b2.getSpeed());
        System.out.println("------");




        }
    }

