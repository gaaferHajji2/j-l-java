package simpleswingexample;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BoxLayoutExample {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("Box Layout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container container = frame.getContentPane();
            
            JPanel hPanel= new JPanel();
            BoxLayout hBoxLayout = new BoxLayout(hPanel, BoxLayout.X_AXIS);
            hPanel.add(new JButton("JLoka-01"));            
            hPanel.add(new JButton("JLoka-02"));
            hPanel.add(new JButton("JLoka-03"));
            hPanel.setLayout(hBoxLayout);
            container.add(hPanel, BorderLayout.NORTH);
            
            JPanel vPanel =  new JPanel();
            BoxLayout vBoxLayout = new BoxLayout(vPanel, BoxLayout.Y_AXIS);
            vPanel.add(new JButton("JLoka-04"));
            vPanel.add(new JButton("JLoka-05"));
            vPanel.add(new JButton("JLoka-06"));
            vPanel.setLayout(vBoxLayout);
            container.add(vPanel, BorderLayout.CENTER);
            
            frame.pack();
            frame.setVisible(true);
            
        });
    }
    
}
