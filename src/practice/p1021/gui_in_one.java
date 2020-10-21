package practice.p1021;
import java.awt.*;
import javax.swing.*;

public class gui_in_one extends JFrame{
    gui_in_one(){
        setVisible(true);
        setSize(100,100);
        setLayout(new BorderLayout());
        setTitle("yes");
        add(new JButton("hello"));
    }
    public static void main(String [] args){
        new gui_in_one();
    }
}
