import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Summer2025 {

    static int wordCount = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank Account");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // player 1
        JLabel l1 = new JLabel("Player 1 will write a sentence");
        JTextField t1 = new JTextField(10);
        JButton b1 = new JButton("Submit");


        //player 2
        JLabel l2 = new JLabel("Player 2 will guess the number of word");
        JTextField t2 = new JTextField(10);
        JButton b2 = new JButton("Guess");

        JLabel l3 = new JLabel("Result will be shown here");
        

        frame.setLayout(new java.awt.FlowLayout());

        
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);

        frame.add(l2);
        frame.add(t2);
        frame.add(b2);

        frame.add(l3);


        frame.setVisible(true);

        b1.addActionListener( e -> {

            String sentence = t1.getText();

            wordCount = sentence.trim().split(" ").length;

            t1.setText(" ");





        } );

        b2.addActionListener( e -> {

            int guess = Integer.parseInt(t2.getText());

            if(guess == wordCount ){
                l3.setText("Player 2 wins");
            }else{
                l3.setText("player 1 wins");
            }

        });


       

        


        



        
    }
    
}
