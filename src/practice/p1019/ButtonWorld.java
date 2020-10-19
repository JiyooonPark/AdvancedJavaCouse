package practice.p1019;

import java.awt.*;
import javax.swing.*;

public class ButtonWorld extends JFrame{
    public ButtonWorld(){
        setVisible (true);
        setTitle("button world");
        setLayout( new GridLayout(1, 1));
        setSize(700, 700);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(10, 10));
        for(int i=0; i<100; i++){
            p.add(new JButton("'^'"));
        }
        add(p);
    }
    public static void main(String [] args){
        new ButtonWorld();
    }
}
