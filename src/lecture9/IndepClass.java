package lecture9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

///1. 독립된 클래스로 만들기
class MyGUI1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("확인 버튼 누름");
    }
}

public class IndepClass extends JFrame {
    IndepClass(){
        setTitle("!!");
        setLayout(new FlowLayout());
        setSize(300, 300);
        JButton btn = new JButton("확인");
        //2. 리스너 등록
        btn.addActionListener(new MyGUI1());
        //자동으로 함수 실행됨
        add(btn);
        setVisible(true);

    }
    public static void main(String [] args){
        new IndepClass();
    }
}
