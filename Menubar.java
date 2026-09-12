import javax.swing.*;
 
public class Menubar {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Option 1");

        JCheckBoxMenuItem item = new JCheckBoxMenuItem("debug");
        JCheckBoxMenuItem item1 = new JCheckBoxMenuItem("debug1");
        JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("debug2");



        menu.add(item);
        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);


        frame.setJMenuBar(menuBar);
        frame.add(panel);




        


        frame.setTitle("My Frame");
        frame.setVisible(true);

        


    
        
    }

    
}