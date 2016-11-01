package tw.org.iii.javatest;
public class Java13 {
    public static void main(String[] args){
        int p1,p2,p3,p4,p5,p6;
        p1=p2=p3=p4=p5=p6=0;

//        for(int i=0 ;i<a.length ;i++) {
//            System.out.println(a[i]);
//        }
        for (int a=0;a<100; a++){
           int point=(int)(Math.random()*6) ;
            switch (point){
                case 0 : p1++ ; break;
                case 1 : p2++ ; break;
                case 2 : p3++ ; break;
                case 3 : p4++ ; break;
                case 4 : p5++ ; break;
                case 5 : p6++ ; break;
            }
            System.out.println(point);
        }
    }
}
