package answers.midterm;

import javax.swing.*;
import java.awt.*;

public class lastQuestion extends JFrame {
    lastQuestion(){
        setVisible(true);
        setSize(300, 600);
        setLayout(new GridLayout(1, 3));
        String [] list = {"a", "b", "c"};
        JButton btn;
        for(int i=0; i<3; i++){
            btn = new JButton(list[i]);
            add(btn);
        }
    }
    public static void main(String [] args){
        new lastQuestion();
    }
}
