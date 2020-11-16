package lecture10.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewer_blackpink extends JFrame {
    JButton btnprev, btnnext;
    ImageIcon [] img;
    String [] description = {"Jennie", "Jisoo", "Rose", "Lisa"};
    JLabel imglbl, imgdesc;
    int cnt, SIZE = 8;

    ImageViewer_blackpink() {
        setTitle("BLACKPINK");
        Font f = new Font("", Font.BOLD, 30);
        Font f2 = new Font("", Font.BOLD, 20);

        JPanel panel = new JPanel();
        btnprev = new JButton("<<");
        btnnext = new JButton(">>");
        btnprev.setFont(f);
        btnnext.setFont(f);

        img = new ImageIcon[SIZE];

        panel.setBackground(Color.darkGray);

        for (int i = 0; i < SIZE; i++) {
            String path = "image/bp" + i + ".jpg";
            img[i] = new ImageIcon(path);
        }
        //don't need to initiate cnt ( java does it automatically)
        cnt = 0;
        imglbl = new JLabel(img[cnt]);
        imgdesc = new JLabel(description[cnt]);
        imgdesc.setFont(f2);

        class Preview implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cnt<=0){
                    //imgdesc.setText("end of photos");
                    JFrame frame = new JFrame("BLACKPINK");
                    JOptionPane.showMessageDialog(frame, "end of photos");
                }
                else {
                    cnt--;
                    imglbl.setIcon(img[cnt]);
                    imgdesc.setText(description[cnt%4]);
                }
            }
        }
        class Next implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                //cnt = (cnt+1) % 4;
                if(cnt>=SIZE-1){
                    //imgdesc.setText("end of photos");
                    JFrame frame = new JFrame("BLACKPINK");
                    JOptionPane.showMessageDialog(frame, "end of photos");
                }
                else {
                    cnt++;
                    imglbl.setIcon(img[cnt]);
                    imgdesc.setText(description[cnt%4]);
                }
            }
        }

        btnprev.addActionListener(new Preview());
        btnnext.addActionListener(new Next());
        add(imglbl, "Center");

        panel.add(btnprev);
        panel.add(btnnext);
        add(imgdesc, "North");

        add(panel, "South");
        setSize(500, 600);
        setVisible(true);

    }
    public static void main(String [] args){
        new ImageViewer_blackpink();
    }
}
