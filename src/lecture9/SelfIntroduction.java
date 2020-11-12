package lecture9;
//1876166 박지윤 자바 과제 9주차
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

///1. 독립된 클래스로 만들기
public class SelfIntroduction extends JFrame {
    JButton btn1, btn2;
    JLabel text;
    //멤버변수로 정의하면 어디서든 사용 가능
    SelfIntroduction(){
        setTitle("나의 소개 ");
        setLayout(new FlowLayout());
        setSize(300, 300);
        btn1 = new JButton("나의 이름");
        btn2 = new JButton("나의 꿈");
        text = new JLabel();

        //2.익명 리스너 등록
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("나의 이름은 박지윤 입니다. ");
                text.setFont(new Font("바탕", Font.BOLD, 20));
                text.setForeground(new Color(126, 60, 199));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("나의 꿈은 CEO 입니다. ");
                text.setFont(new Font("궁서", Font.PLAIN, 20));
                text.setForeground(new Color(1, 81, 14));
            }
        });

        add(btn1);
        add(btn2);
        add(text);
        setVisible(true);

    }
    public static void main(String [] args){
        new SelfIntroduction();
    }
}
