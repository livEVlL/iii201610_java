package tw.org.iii.javatest;
public class Java09 {
    public  static  void  main(String[] args){
        // for (首次執行敘述句； 執行前的判斷； 執行後的敘述句)
        int i=0 ;
        for (m1();i<10;System.out.println("----")){
            System.out.println(i++);
        }
    }
    static void  m1(){
        System.out.println("hi");
    }
}
