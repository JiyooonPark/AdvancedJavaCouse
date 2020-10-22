package practice.p1022;
import java.awt.*;
import javax.swing.*;

public class gui extends JFrame{
    gui(){
        setVisible(true);
        setSize(1000, 1000);
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JButton("hello"), BorderLayout.NORTH);
        p.add(new JButton("hello"));
        p.add(new JButton("hello"));
        p.add(new JButton("hello"));
        p.add(new JButton("hello"), BorderLayout.NORTH);
        p.add(new JButton("hello"), BorderLayout.NORTH);
        p.add(new JButton("hello"), BorderLayout.NORTH);
        JPanel j = new JPanel();
        j.setLayout(new GridLayout(1,5, 10, 10));
        String [] list = {"d","d", "d","d","d"};
        for(int i=0; i<5; i++){
            j.add(new Button(list[i]));
        }
        add(j);
    }
    public static void main(String [] args){
        new gui();
    }
}
