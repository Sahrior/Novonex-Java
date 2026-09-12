import javax.swing.*;
 
public class Button {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button1 = new JButton();
        button1.setText("Click me");



        panel.add(button1);


        frame.setTitle("My Frame");
        frame.setVisible(true);

        frame.add(panel);


    
        
    }

    
}