package tw.org.iii.javatest;

public class Homework2 {
public static void main (String[] args){
    int[] poker= new int[10];
    int temp;
    for(int i=0 ;i <poker.length ;i++){
        poker[i]=i;
    }
    for(int j=1; j<poker.length ; j++){
       int p1 = poker.length -(j);
       int p2 =(int)(Math.random()* (poker.length-j));
       temp = poker[p2];
       poker[p2]=poker[p1];
       poker[p1]=temp;
    }
    for(int k=0; k<poker.length;k++){
    System.out.print(poker[k]+" ,\t");
        }
    }
}

