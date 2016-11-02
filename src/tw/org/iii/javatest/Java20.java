package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java20 extends JFrame {
    private JButton open, save, exit;

    public Java20(){
        super("我的視窗程式");
        setSize(640,480);
        setLayout(new FlowLayout());

        open = new JButton("Open");
        save = new JButton("Save");
        exit = new JButton("Exit");
        add(open);add(save);add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        setVisible(true);
        System.out.println("I am Java!!");
    }
    public  static  void main(String[] args){
        Java20 b1  = new Java20();
    }
}

