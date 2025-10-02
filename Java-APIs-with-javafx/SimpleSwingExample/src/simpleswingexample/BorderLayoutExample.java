package simpleswingexample;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayoutExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            final int hGap = 20;
            final int vGap = 10;
            
            Container container = frame.getContentPane();
            container.setLayout(new BorderLayout(hGap, vGap));            
            
            JButton closeButton = new JButton("Close");
            JButton helpButton = new JButton("Help");
            JButton jLoka01 = new JButton("JLoka-01");            
            JButton jLoka02 = new JButton("JLoka-02");
            JButton jLoka03 = new JButton("JLoka-03");
            
            container.add(closeButton, BorderLayout.EAST);
            container.add(helpButton, BorderLayout.WEST);
            container.add(jLoka01, BorderLayout.CENTER);
            container.add(jLoka02, BorderLayout.NORTH);
            container.add(jLoka03, BorderLayout.SOUTH);
            
            frame.pack();
            
            frame.setVisible(true);
            
        });
    }
    
}
