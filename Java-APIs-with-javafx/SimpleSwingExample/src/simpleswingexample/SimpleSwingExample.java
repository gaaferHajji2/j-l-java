package simpleswingexample;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SimpleSwingExample {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing Example");
            
            JButton closeButton = new JButton("Close");
            JButton helpButton = new JButton("Help");
            
            final int hGap = 20;
            final int vGap = 10;
            
            Container container = frame.getContentPane();
            container.setLayout(new FlowLayout(FlowLayout.RIGHT, hGap, vGap));
            
            container.add(closeButton);
            container.add(helpButton);
            
            Component[] components = container.getComponents();
            System.out.println("There is/are: " + components.length + " componnet/s");
            
            //set size and location
//            frame.setBounds(350, 350, 350, 350);
            
            frame.setVisible(true);
            
            frame.pack();
            
            frame.setLocation(50, 50);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
    
}
