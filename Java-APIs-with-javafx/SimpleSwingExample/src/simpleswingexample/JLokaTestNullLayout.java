package simpleswingexample;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JLokaTestNullLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Test Null Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = frame.getContentPane();
            container.setLayout(null);
            
            JButton btn1 = new JButton("JLoka-01");
            JButton btn2 = new JButton("JLoka-02");
            container.add(btn1);
            container.add(btn2);
            
            btn1.setBounds(10, 10, 100, 20);
            btn2.setBounds(120, 10, 100, 20);
            
            frame.setBounds(0, 0, 350, 100);
            frame.setVisible(true);
        });
    }
    
}
