package lecture10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPhoto extends JFrame{
    JLabel lbl, imglbl;
    JButton btn;
    MyPhoto(){
        setTitle("MyPhoto");
        Font f = new Font("", Font.BOLD, 30);
        lbl = new JLabel("fall");
        lbl.setFont(f);

        //import image
        ImageIcon img1 = new ImageIcon("p1.png");
        ImageIcon img2 = new ImageIcon("p2.png");

        imglbl = new JLabel(img1);
        btn = new JButton("change");
        btn.setFont(f);

        //add button listener without creating a new class
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //change label component's context
                imglbl.setIcon(img2);
                //try it : allow the image to change back and forth

            }
        });

        add(lbl, "North");
        add(imglbl, "Center");
        add(btn, "South");


        setVisible(true);
        setSize(500, 500);

    }
    public static void main(String [] args){
        new MyPhoto();
    }
}
