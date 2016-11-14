package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class MyPanel extends JPanel{
    private LinkedList<LinkedList<HashMap<String,Integer>>> lines , recycle;


    public MyPanel(){
        MyMouseListener myMouseListener = new MyMouseListener();
        addMouseMotionListener(myMouseListener);
        addMouseListener(myMouseListener);
        lines = new LinkedList<>();
        recycle = new LinkedList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.black);
        g2d.setColor(Color.yellow);             //顏色
        g2d.setStroke(new BasicStroke(2));     //畫筆


        // ↓用畫一條線的code用Foreach方式做出來
        for(LinkedList<HashMap<String,Integer>> line : lines){
            for(int i=1; i<line.size() ;i++){
                HashMap<String,Integer> p0 = line.get(i-1);
                HashMap<String,Integer> p1 = line.get(i);
                g2d.drawLine(p0.get("x"),p0.get("y"),p1.get("x"),p1.get("y"));
            }
        }

//        // 畫一條線的code ↓
//        for(int i=1; i<line.size() ;i++){
//            HashMap<String,Integer> p0 = line.get(i-1);
//            HashMap<String,Integer> p1 = line.get(i);
//            g2d.drawLine(p0.get("x"),p0.get("y"),p1.get("x"),p1.get("y"));
//        }


//
//       g2d.drawLine(0,0,300,300);

    }

    private class MyMouseListener extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
        //    super.mousePressed(e);
            LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
            int x= e.getX(); int y =e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x); point.put("y",y);  // 抓到X就給x當值,Y同理
            line.add(point);
            lines.add(line);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x= e.getX(); int y =e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x); point.put("y",y);  // 抓到X就給x當值,Y同理
            lines.getLast().add(point);
            repaint();
     }
    }

    void clear(){
        lines.clear();
        repaint();
    }

    void undo() {
        if (lines.size() > 0) {
            recycle.add(lines.removeLast());
            repaint();
        }
    }

    void redo(){
        if (recycle.size() > 0) {
            lines.add(recycle.removeLast());
            repaint();
        }
    }

}

