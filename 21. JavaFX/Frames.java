import javax.swing.*;
import java.awt.*;

public class Frames {
    public static void main(String[] args) {
        //JFreame= a GUI windows to add components

        JFrame frame=new JFrame();
        frame.setTitle("Jframe Tutorial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        ImageIcon image=new ImageIcon("D://Wallpapers//Anime//Gojo.jpg");
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
//        frame.getContentPane().setBackground(Color.GRAY);
        frame.getContentPane().setBackground(new Color(0,124,210));


    }
}
