package lecture9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

///1. 독립된 클래스로 만들기
class MyGUI2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton btn = (JButton) e.getSource();
        if(btn.getText().equals("확인"))
            btn.setText("OK");
        else
            btn.setText("확인");
    }
}

public class IndepClass_change_button extends JFrame {
    IndepClass_change_button(){
        setTitle("!!");
        setLayout(new FlowLayout());
        setSize(300, 300);
        JButton btn = new JButton("확인");
        //2. 리스너 등록
        btn.addActionListener(new MyGUI2());
        //자동으로 함수 실행됨
        add(btn);
        setVisible(true);

    }
    public static void main(String [] args){
        new IndepClass_change_button();
    }
}
