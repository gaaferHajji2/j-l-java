package simpleswingexample;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class JLokaTestSpringLayoutWithConstraint2 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Test Spring Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = frame.getContentPane();
            SpringLayout springLayout = new SpringLayout();
            container.setLayout(springLayout);
            
            JButton btn1 = new JButton("JLoka Btn-01");            
            JButton btn2 = new JButton("JLoka Btn-02");

            container.add(btn1);
            container.add(btn2);
            
            // define the constraints
            
            // 1 ==> set x for btn1
            springLayout.putConstraint(SpringLayout.WEST, btn1, 10, SpringLayout.WEST, container);
            
            // 2 ==> set y for btn1
            springLayout.putConstraint(SpringLayout.NORTH, btn1, 20, SpringLayout.NORTH, container);
            
            // 3 ==> set x for btn2 depending on btn1
            springLayout.putConstraint(SpringLayout.WEST, btn2, 10, SpringLayout.EAST, btn1);
            
            // 4 ==> set y for btn2
            // springLayout.putConstraint(SpringLayout.NORTH, btn2, 20, SpringLayout.NORTH, container);
            
            // 5 ==> Set y for container
            springLayout.putConstraint(SpringLayout.SOUTH, container, 10, SpringLayout.SOUTH, btn1);
            
            // 6 ==> set x for container
            springLayout.putConstraint(SpringLayout.EAST, container, 10, SpringLayout.EAST, btn2);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
