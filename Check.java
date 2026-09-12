import javax.swing.*;
 
public class Check {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        JCheckBox c1 = new JCheckBox("Java");

        c1.setSelected(false);



        panel.add(c1);



        frame.setTitle("My Frame");
        frame.setVisible(true);

        frame.add(panel);


    
        
    }

    
}