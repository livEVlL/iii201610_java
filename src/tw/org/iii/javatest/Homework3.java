package tw.org.iii.javatest;

import javax.swing.*;

public class Homework3 {
public static void main(String[] args){
    String strYear = JOptionPane.showInputDialog("請輸入年份");
    int intYear = Integer.parseInt(strYear);
     // System.out.println(intYear);
    String strMonth = JOptionPane.showInputDialog("請輸入月份");
    int intMonth = Integer.parseInt(strMonth);
    System.out.printf("你輸入的年份為" + intYear + "年、"+ intMonth + "月。");
    System.out.println("\n日 一 二 三 四 五 六");
    java.util.Date days;
    days =new java.util.Date(intYear-1900,intMonth-1,1);
    for (int i =0; i <days.getDay();i++ ){
        System.out.print("　 "); //如果第一天為星期x，空出xx天
    }
    for (int i=1; i<= 31;i++){
        java.util.Date d;
        d=new java.util.Date(intYear-1900,intMonth-1,i);

        if (d.getMonth()+1 !=intMonth){ //物件的月份，不等於使用者輸入的月份
            break;
        }
        System.out.printf("%2d ",i);
        if (d.getDay() ==6){
            System.out.println();
        }
    }

}
}
