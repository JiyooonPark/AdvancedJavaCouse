package lecture10;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest  extends JFrame {
    KeyTest(){
        setTitle("이벤트처리");
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
        new KeyTest();

    }
}
