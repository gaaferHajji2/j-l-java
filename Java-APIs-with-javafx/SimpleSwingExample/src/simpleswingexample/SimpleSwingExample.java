package simpleswingexample;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SimpleSwingExample {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing Example");
            frame.setBounds(350, 350, 350, 350);
            frame.setVisible(true);
        });
    }
    
}
