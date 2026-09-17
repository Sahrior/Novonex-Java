import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fall2k24 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Feet to inches");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Feet");
        JTextField t1 = new JTextField(10);

        JButton b1 = new JButton("Convert...");

        JLabel label2 = new JLabel("Inches");
        JTextField t2 = new JTextField(10);

        frame.setLayout(new java.awt.FlowLayout());


        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.add(label2);
        frame.add(t2);
        
        



        
    }
    
}
