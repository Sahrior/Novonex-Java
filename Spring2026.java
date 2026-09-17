import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Spring2026 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank Account");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel balance = new JLabel("5000.00");
        JTextField t1 = new JTextField(10);

        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");




        

        frame.setLayout(new java.awt.FlowLayout());

        frame.add(balance);
        frame.add(t1);
        frame.add(deposit);
        frame.add(withdraw);

        


       
        
        frame.setVisible(true);


        deposit.addActionListener(e -> {

            try {
                String b1 = balance.getText();
                double b2 = Double.parseDouble(b1);

                double amount = Double.parseDouble(t1.getText());

                double finalvalue = b2 + amount;

                String b3 = String.valueOf(finalvalue);

                balance.setText(b3);
            }catch(NumberFormatException ex){
                balance.setText("Invalide amaount");
            }


        });

        withdraw.addActionListener(e -> {

            String b1 = balance.getText();
            double b2 = Double.parseDouble(b1);

            double amount = Double.parseDouble(t1.getText());

            double finalvalue = b2 - amount;

            String b3 = String.valueOf(finalvalue);

            balance.setText(b3);



        });

        


        



        
    }
    
}
