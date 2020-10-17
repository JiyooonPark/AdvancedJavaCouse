package practice;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        setVisible(true);
        setTitle("made for fun");
        setSize(400, 600);
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(2,1));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 6));
        for(int i=0; i<24; i++){
            p.add(new JButton(" '<>'"));
        }
        add(p);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
//        JLabel j = new JLabel();
//        j.setText("enter something");
//        p2.add(j);
        p2.add(new JLabel("enter something"));
        p2.add(new JTextField());
        add(p2);
    }
    public static void main(String [] args){
        new MyFrame();
    }
}
