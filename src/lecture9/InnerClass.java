package lecture9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

///1. 독립된 클래스로 만들기
public class InnerClass extends JFrame {
    JButton btn1, btn2;
    //멤버변수로 정의하면 어디서든 사용 가능
    InnerClass(){
        setTitle("!!");
        setLayout(new FlowLayout());
        setSize(300, 300);
        btn1 = new JButton("확인");
        btn2 = new JButton("취소");
        //2. 리스너 등록
        btn1.addActionListener(new MyGUI3());
        btn2.addActionListener(new MyGUI4());
        //자동으로 함수 실행됨
        add(btn1);
        add(btn2);
        setVisible(true);

    }

    class MyGUI3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle("확인");
            btn1.setText("OK");
        }

    }
    class MyGUI4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle("취소를 누르셨군요");
        }

    }


    public static void main(String [] args){
        new InnerClass();
    }


}
