import javax.swing.*;
 
public class Textfield {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        JTextField t = new JTextField(20);


        //t.setEditable(true);


        panel.add(t);

        



        


        frame.setTitle("My Frame");
        frame.setVisible(true);

        frame.add(panel);


    
        
    }

    
}
