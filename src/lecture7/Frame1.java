package lecture7;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame {
    public Frame1(){
        setTitle("BorderLayoutTest");
        setSize(300, 550);
        //기본 관리자여서 불필요!
        setLayout(new BorderLayout());

        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

     //   add(b1);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        //add(b1, "North");
//        add(b3, BorderLayout.EAST);
//        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        setVisible(true);

    }
    public static void main(String [] args){
        new Frame1();
    }
}
