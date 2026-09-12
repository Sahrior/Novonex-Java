import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Counter");
        frame.setSize(150,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField result = new JTextField("Enter your number");
        result.setEditable(false);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multi = new JButton("X");
        JButton divide = new JButton("/");
        JButton reset = new JButton("C");


        panel.add(result);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b0);

        panel.add(minus);
        panel.add(plus);
        panel.add(multi);
        panel.add(divide);
        panel.add(reset);


        b1.addActionListener(e -> {
            
        });

        


        frame.add(panel);
        frame.setVisible(true);








    }
    
}
