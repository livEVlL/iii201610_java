package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;

public class MyPainter extends JFrame {
    private JButton clear, undo,redo;
    private MyPanel myPanel;
    public MyPainter(){  //設定視窗基本樣子
        super("簽名板");
        setLayout(new BorderLayout());
        JPanel top = new JPanel(new FlowLayout());
        clear = new JButton("clear");
        undo = new JButton("undo");
        redo = new JButton("redo");
        top.add(clear);top.add(undo);top.add(redo);
        add(top, BorderLayout.NORTH); //放在畫面的上方

        myPanel = new MyPanel();             // 新增建構無傳參數式
        add(myPanel,BorderLayout.CENTER);  //放置中央

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new MyPainter();
    }
}
