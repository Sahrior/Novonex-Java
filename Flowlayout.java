import javax.swing.*;
import java.awt.*;
 
public class Flowlayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Flow layout example");
        frame.setSize(100,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.FlowLayout());

        
        JButton b1 = new JButton("1");

        JButton b2 = new JButton("1");

        JButton b3 = new JButton("1");
        JButton b4 = new JButton("1");


        JButton b5 = new JButton("1");
        JButton b6 = new JButton("1");
        JButton b7 = new JButton("1");
        JButton b8 = new JButton("1");

        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        frame.add(panel);
        frame.setVisible(true);








    
        
    }

    
}
