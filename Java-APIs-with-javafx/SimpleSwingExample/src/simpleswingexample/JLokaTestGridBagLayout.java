package simpleswingexample;

import java.awt.Container;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JLokaTestGridBagLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Test GridBag Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container content = frame.getContentPane();
            
            content.setLayout(new GridBagLayout());
            
            for (int i=0; i<3; ++i) {
                content.add(new JButton("JLoka Button " + (i+1)));
            }
            
            frame.pack();
            frame.setVisible(true);
        });
        
    }
    
}
