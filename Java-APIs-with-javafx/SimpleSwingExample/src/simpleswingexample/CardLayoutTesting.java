package simpleswingexample;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class CardLayoutTesting {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Card Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = frame.getContentPane();
            
            final int hGap = 10;
            final int vGap = 20;
           
            JButton next = new JButton("Next Card");

            JPanel panel1 = new JPanel();
            panel1.add(next);
            container.add(panel1, BorderLayout.SOUTH);
            
            JPanel panel2 = new JPanel();
            CardLayout cardLayout = new CardLayout(hGap, vGap);
            panel2.setLayout(cardLayout);
            
            for(int i=0; i<5; ++i) {
                JButton t1 = new JButton("JLoka-0" + (i + 1));
                t1.setPreferredSize(new Dimension(100, 100));
                String t2 = "JLoka-0" + (i + 1);
                panel2.add(t1, t2);
            }
            
            container.add(panel2, BorderLayout.CENTER);
            
            next.addActionListener((e) -> {cardLayout.next(panel2);});
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
