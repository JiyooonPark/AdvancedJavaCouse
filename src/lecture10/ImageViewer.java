package lecture10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewer extends JFrame {
    JButton btnprev, btnnext;
    ImageIcon [] img;
    JLabel imglbl;
    int cnt;

    ImageViewer() {
        setTitle("Online Trip");
        Font f = new Font("", Font.BOLD, 30);

        JPanel panel = new JPanel();
        btnprev = new JButton("<<");
        btnnext = new JButton(">>");
        btnprev.setFont(f);
        btnnext.setFont(f);
        img = new ImageIcon[4];

        panel.setBackground(Color.darkGray);

        for (int i = 0; i < 4; i++) {
            String path = "image/img" + i + ".png";
            img[i] = new ImageIcon(path);
        }
        //don't need to initiate cnt ( java does it automatically)
        cnt = 0;
        imglbl = new JLabel(img[cnt]);

        class Preview implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                cnt = (cnt-1+4) % 4;
                //cnt--;
                imglbl.setIcon(img[cnt]);
            }
        }
        class Next implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                cnt = (cnt+1) % 4;
                //cnt++;
                imglbl.setIcon(img[cnt]);
            }
        }

        btnprev.addActionListener(new Preview());
        btnnext.addActionListener(new Next());
        add(imglbl, "Center");

        panel.add(btnprev);
        panel.add(btnnext);

        add(panel, "South");
        setSize(500, 600);
        setVisible(true);

    }
    public static void main(String [] args){
        new ImageViewer();
    }
}
