package lecture7;

import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame {
    Frame2(){
        setTitle("FlowLayoutTest");
        setSize(300, 550);
        setVisible(true);
        //컴포넌트 생성
        //배치관리자 바꾸는 방법
        setLayout(new FlowLayout());
//        JButton b1 = new JButton("btn1");
//        add(b1);
        add(new JButton("btn1"));
        add(new JButton("btn2"));
        add(new JButton("btn3"));
        add(new JButton("btn4"));

    }
    public static void main(String [] args){
        new Frame2();
    }
}
