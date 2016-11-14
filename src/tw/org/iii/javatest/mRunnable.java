package tw.org.iii.javatest;

public class mRunnable {

}
class MyRunnable implements Runnable{
    private String name;
    MyRunnable(String name){this.name = name;}
    @Override
    public void run() {
        for(int i =0; i<20 ; i++){
            System.out.println(name+ ":" +i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }

    }
}
