import javax.swing.*;
import java.awt.*;
 
public class Borderlayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Flow layout example");
        frame.setSize(100,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());

        
        JButton b1 = new JButton("1");

        JButton b2 = new JButton("2");

        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");


        JButton b5 = new JButton("5");

        JLabel l1 = new JLabel("hello");
        

        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(l1);

        frame.add(panel);
        frame.setVisible(true);








    
        
    }

    
}
