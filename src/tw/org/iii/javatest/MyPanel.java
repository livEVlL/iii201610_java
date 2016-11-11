package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class MyPanel extends JPanel implements MouseMotionListener{
    private LinkedList<HashMap<String,Integer>> line;


    public MyPanel(){
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.black);
        g2d.setColor(Color.yellow);             //顏色
        g2d.setStroke(new BasicStroke(2));     //畫筆

        for(int i=1; i<line.size() ;i++){
            HashMap<String,Integer> p0 = line.get(i-1);
            HashMap<String,Integer> p1 = line.get(i);
            g2d.drawLine(p0.get("x"),p0.get("y"),p1.get("x"),p1.get("y"));
        }


//
//       g2d.drawLine(0,0,300,300);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
       int x= e.getX(); int y =e.getY();
        HashMap<String,Integer> point = new HashMap<>();
        point.put("x",x); point.put("y",y);  // 抓到X就給x當值,Y同理
        line.add(point);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
}
