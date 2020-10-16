package lecture7;

import javax.swing.*;
import java.awt.*;

public class Piano extends JFrame {
    public Piano(){
        setTitle("가상 미니 피아노");
        setSize(700, 200);
        setVisible(true);
        setLayout(new GridLayout(1, 8));
        String keys[] = {"도", "레", "미", "파", "솔", "라", "시", "도"};
        for(int i=0; i<8; i++){
            add(new JButton(keys[i]));
        }

    }
    public static void main(String [] args){
        Piano p = new Piano();
    }
}
