package simpleswingexample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JLokaTestGridLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka GridLayout Test");
            Container content = frame.getContentPane();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            GridLayout gridLayout = new GridLayout(5, 0, 10, 5);
            //content.setLayout(gridLayout);
            
            JPanel panel = new JPanel();
            panel.setLayout(gridLayout);
            
            for (int i=0; i<20; ++i) {
                panel.add(new JButton("JLoka Button " + (i+1)));
            }
            
            content.add(panel, BorderLayout.CENTER);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
