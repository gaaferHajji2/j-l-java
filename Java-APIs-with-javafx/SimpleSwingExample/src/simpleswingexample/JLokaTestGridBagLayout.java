package simpleswingexample;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
            
            GridBagConstraints t1 = new GridBagConstraints();
            
            for (int i=0; i<5; ++i) {
                for (int j=0; j<5; ++j){
                    t1.gridx = i == 4 ? GridBagConstraints.RELATIVE : i;
                    t1.gridy = j == 4 ? GridBagConstraints.RELATIVE : j;
                    t1.insets = new Insets(10, 10, 10, 10);
                    content.add(new JButton("JLoka Button " + (i+1)), t1);
                }
            }
            
            frame.pack();
            frame.setVisible(true);
        });
        
    }
    
}
