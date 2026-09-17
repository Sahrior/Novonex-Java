
import javax.swing.*;
 
public class Recap {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("Click me");



       
        frame.add(b1);
        frame.setTitle("My Frame");
        frame.setVisible(true);


        b1.addActionListener( e -> {
            System.out.println("Button clicked");
        } );

        
    }

    
}