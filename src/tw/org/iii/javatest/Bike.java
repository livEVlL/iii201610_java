package tw.org.iii.javatest;
public class Bike {
    // 定義 Member:成員 > 屬性 / 方法
    // public > protected > (
   private double speed;

    Bike(){
        System.out.println("Bike()");
    }
    Bike(int gear){
        System.out.println("Bike(int)");
    }


    void upSpeed(){
        speed = speed<1?1:speed*1.2;
    }
    void upSpeed(int gear){
        speed = speed<1?1:speed*(gear);
    }
    void upSpeed(double gear){
        speed = speed<1?1:speed*(gear);
    }
    void downSpeed(){
        speed = speed<1?0:speed*0.7;
    }
    double getSpeed(){
        return speed;
    }

}
