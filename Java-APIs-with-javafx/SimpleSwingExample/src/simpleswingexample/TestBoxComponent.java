package simpleswingexample;

import java.awt.Container;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestBoxComponent {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test Box Component");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container container = frame.getContentPane();
            
            Box hBox = Box.createHorizontalBox();
            hBox.add(new JButton("JLoka-01"));
            hBox.add(Box.createHorizontalStrut(150));
//            hBox.add(Box.createHorizontalGlue());
            hBox.add(new JButton("JLoka-02"));
            hBox.add(Box.createHorizontalStrut(150));
//            hBox.add(Box.createHorizontalGlue());
            hBox.add(new JButton("JLoka-03"));
            
            container.add(hBox);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
