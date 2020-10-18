package lecture7;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_test extends JFrame{
    FlowLayout_test(){
        setVisible(true);
        setSize(700,300);
        setLayout(new GridLayout(3,1));
        JPanel p1= new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        for(int i=0; i<10; i++){
            p1.add(new JButton("0.0"));
        }
        add(p1);

        JPanel p2= new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        for(int i=0; i<10; i++){
            p2.add(new JButton("^^"));
        }
        add(p2);

        JPanel p3= new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int i=0; i<10; i++){
            p3.add(new JButton("!!"));
        }
        add(p3);
    }
    public static void main(String [] args){
        new FlowLayout_test();
    }
}
