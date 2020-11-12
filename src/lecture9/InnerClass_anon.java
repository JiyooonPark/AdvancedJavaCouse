package lecture9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

///1. 독립된 클래스로 만들기
public class InnerClass_anon extends JFrame {
    JButton btn1, btn2;
    //멤버변수로 정의하면 어디서든 사용 가능
    InnerClass_anon(){
        setTitle("!!");
        setLayout(new FlowLayout());
        setSize(300, 300);
        btn1 = new JButton("확인");
        btn2 = new JButton("취소");

        //2.익명 리스너 등록
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("확인");
                btn1.setText("OK");
                btn1.setBackground(Color.ORANGE);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("취소를 누르셨군요");

            }
        });
        //자동으로 함수 실행됨
        add(btn1);
        add(btn2);
        setVisible(true);

    }
    public static void main(String [] args){
        new InnerClass_anon();
    }
}
