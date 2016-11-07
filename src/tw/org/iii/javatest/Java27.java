package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java27 extends JFrame implements ActionListener{
    private JButton newFile, openFile,saveFile,saveAsFila,exit;
    private JTextArea editor ;
    public Java27(){
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFila = new JButton("Save as");
        exit = new JButton("Exit");
        editor = new JTextArea();

        newFile.addActionListener(new MyListener());
        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveFile);
        top.add(saveAsFila);top.add(exit);

        add(top,BorderLayout.NORTH);
        add(editor,BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Java27();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("B");
    }
}
class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A");
    }
 }