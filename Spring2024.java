import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Spring2024 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel output = new JLabel("10");
        JTextField input = new JTextField(10);
        JButton perform = new JButton("Perform");

        frame.setLayout(new java.awt.FlowLayout());

        frame.add(output);
        frame.add(input);
        frame.add(perform);


       
        
        frame.setVisible(true);

        perform.addActionListener(e -> {

            String s1 = input.getText();

            String[] parts = s1.split(" ");

            String operator = parts[0];
            double number = Double.parseDouble(parts[1]);

            double out = Double.parseDouble(output.getText());

            if(operator.equals("+")){
                out = out + number;
            }else if(operator.equals("-")){
                out = out - number;
            }else if(operator.equals("*")){
                out = out * number;
            }else if(operator.equals("/")){
                out = out / number;
            }

            String s2 = String.valueOf(out);

            output.setText(s2);

        });


        



        
    }
    
}
