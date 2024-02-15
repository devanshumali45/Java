import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        ImageIcon imageIcon=new ImageIcon("D://Wallpapers//Anime//solo5.jpg");
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(160, 160,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        Border border =BorderFactory.createLineBorder(Color.green,3);

        JLabel label=new JLabel();
        label.setText("Hey , This is first label");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boil",Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,250,250);



        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(400,400);
        f.setVisible(true);
//        f.setLayout(null);

        f.add(label);
        f.pack();
    }
}
