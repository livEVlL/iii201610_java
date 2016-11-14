package tw.org.iii.javatest;

public class Java51{
    public static void main(String[] args){
        MyThread mt1 = new MyThread("A:");
        MyThread mt2 = new MyThread("B:");

        MyRunnable mr1 = new MyRunnable("C");
        Thread t1 = new Thread(mr1);   //重點在此句!! Runnable不是執行緒，故用Thread來附加此功能
        t1.start();

        mt1.start();
        mt2.start();
        System.out.println("Game Over!");
    }
}
class MyThread extends Thread{
    private String name;
    MyThread(String name){this.name = name;}
    @Override
    public void run() {
        super.run();
        for(int i =0; i<20 ; i++){
            System.out.println(name+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }

    }
}