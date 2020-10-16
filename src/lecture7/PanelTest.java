package lecture7;

import javax.swing.*;
import java.awt.*;

public class PanelTest extends JFrame {
    public PanelTest(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300,100 );
        setVisible(true);

    }
    public static void main(String [] args){
        new PanelTest();
    }
}
