import javax.swing.*;

public class Login {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Counter");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel userName = new JLabel("Enter user name: ");
        JTextField inputBox = new JTextField(15);
        JButton button = new JButton("Submit");
        JLabel result = new JLabel("");


        panel.add(userName);
        panel.add(inputBox);
        panel.add(button);
        panel.add(result);

        button.addActionListener( e -> {

            String name = inputBox.getText();

            result.setText("HI " + name);

        });

        


        frame.add(panel);
        frame.setVisible(true);








    }
    
}
