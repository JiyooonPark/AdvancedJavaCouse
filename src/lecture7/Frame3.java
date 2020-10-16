package lecture7;

import javax.swing.*;
import java.awt.*;

public class Frame3 extends JFrame {
    public Frame3(){
        setTitle("GridLayoutTest");
        setSize(300, 550);
        setVisible(true);
        //컴포넌트 생성
        //배치관리자 바꾸는 방법
        setLayout(new GridLayout(2,2));
        add(new JButton("이종석"));
        add(new JButton("잘생김"));
        add(new JButton("진짜루"));
        add(new JButton("귀여움"));
        
    }
    public static void main(String [] args){
        new Frame3();
    }
}
