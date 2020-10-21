package practice.p1020;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI(){
        setVisible(true);
        setTitle("at least one a day");
        setLayout( new GridLayout(2, 1));
        setSize(300, 400);
        JPanel j = new JPanel();
        j.add(new JButton("I am a button"));
        j.add(new JButton("I am a button"));
        add(j);
        add(j);//cannot add the same object twice

        add(new JButton("Hello"));
    }
    public static void main(String [] args){
        new GUI();
    }
}
