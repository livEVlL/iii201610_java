package tw.org.iii.javatest;

import javafx.beans.property.IntegerProperty;

import javax.swing.*;

/**
 * Created by iii-user on 2016/10/31.
 */
public class Java06 {
    public static void main(String[] args){
        String strScore = JOptionPane.showInputDialog("輸入成績");
        int intScore = Integer.parseInt(strScore);
        System.out.println(intScore);
        if(intScore >= 90) {
            System.out.println("A");
        }else if(intScore >= 80) {
            System.out.println("B");
        }else if(intScore >= 70) {
            System.out.println("C");
        }else if(intScore >= 60) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
