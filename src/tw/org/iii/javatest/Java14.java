package tw.org.iii.javatest;

public class Java14 {
    public static void main(String[] args){
        int[] p=new int[6];

        for (int a=0;a<1000; a++){
            int point=(int)(Math.random()*9) ;
          p[point>=6?point-3:point]++;
        }
        for(int i=0 ; i<p.length ; i++){
            System.out.println((i+1)+"點出現" + p[i] + "次");
        }
    }
}
