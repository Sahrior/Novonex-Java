import javax.swing.*;

public class Counter {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Counter");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("0");
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");
        JButton resetButton = new JButton("Reset");

        panel.add(label);
        panel.add(increaseButton);
        panel.add(decreaseButton);
        panel.add(resetButton);


        increaseButton.addActionListener( e -> {

            int current = Integer.parseInt(label.getText());

            label.setText(Integer.toString(current+1));



        });


        decreaseButton.addActionListener( e -> {

            int current = Integer.parseInt(label.getText());

            label.setText(Integer.toString(current-1));



        } );

        resetButton.addActionListener( e -> {

            label.setText("0");



        } );



        frame.add(panel);
        frame.setVisible(true);








    }
    
}
