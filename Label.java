
import javax.swing.*;
 
public class Label {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Hello world");
        JLabel label1 = new JLabel();

        label.setText("Welcome");
        label1.setText("hello");

        
        panel.add(label);
        panel.add(label1);
        frame.add(panel);
        

        frame.setTitle("My Frame");
        frame.setVisible(true);
        
    }

    
}