package lecture7;

import javax.swing.*;

public class HelloFrame extends JFrame {
    HelloFrame(){
        setTitle("hello frame");
        setSize(300, 400);
        //컴포넌트 생성 : JButton
        JButton btn1 = new JButton("check");//step 1
        add(btn1); //하나의 컴포넌트를 넣는 코드 step 2

        setVisible(true);
    }
    public static void main(String [] args){
        HelloFrame h = new HelloFrame();
    }
}
