package simpleswingexample;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SimpleSwingExample {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing Example");
            
            JButton closeButton = new JButton("Close");
            
            Container container = frame.getContentPane();
            
            container.add(closeButton);
            
            //set size and location
//            frame.setBounds(350, 350, 350, 350);
            
            frame.setVisible(true);
            
            frame.pack();
            
            frame.setLocation(50, 50);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
    
}
