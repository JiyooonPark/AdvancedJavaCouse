package lecture10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest_color_change extends JFrame {

    Container c;
    JLabel lbl; //to output the color

    KeyTest_color_change(){
        setTitle("Key 이벤트처리");
        lbl = new JLabel("<Enter>키도 배경색이 변경됩니다");
        lbl.setFont(new Font("", Font.BOLD, 20));

        c=getContentPane();
        c.setBackground(Color.GRAY);
        c.addContainerListener(new MyKey());
        add(lbl);
        c.requestFocus();

        //this.setBackground(Color.orange);
        //this does not work because JFrame means the whole screen. We need to know the contents frame.
        //ans change only the background color of the content portion
        //getContentPane().setBackground(Color.BLUE);
        //this is not needed for the components but is needed to change content frame.

        //this is another way to get the content frame
        //Container c = getContentPane();
        //c.setBackground(Color.CYAN);

//        JButton btn = new JButton("확인");
//        btn.setBackground(Color.ORANGE);
//        add(btn);


        //set listener
        addKeyListener(new MyKey());
        setSize(300, 200);
        setVisible(true);
    }
    //1. define listener (inner class)
    class MyKey implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //System.out.println(e.getKeyChar());
            System.out.println(e.getKeyCode());
            //why does this not work for me?
        }

        @Override
        //the e in the param can be changed to anything
        public void keyPressed(KeyEvent e) {
           // System.out.println(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
           // System.out.println(e);

        }
    }
    public static void main(String [] args){
        new KeyTest_color_change();

    }
}
