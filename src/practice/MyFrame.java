package practice;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        setVisible(true);
        setTitle("made for fun");
        setSize(400, 600);
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 6));
        for(int i=0; i<24; i++){
            p.add(new JButton(" '<>'"));
        }
        add(p);
    }
    public static void main(String [] args){
        new MyFrame();
    }
}
