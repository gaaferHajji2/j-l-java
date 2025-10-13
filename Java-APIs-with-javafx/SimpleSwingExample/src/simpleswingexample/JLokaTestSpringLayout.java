package simpleswingexample;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class JLokaTestSpringLayout {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Test Spring Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = frame.getContentPane();
            SpringLayout springLayout = new SpringLayout();
            container.setLayout(springLayout);
            
            JButton btn1 = new JButton("JLoka Btn-01");            
            JButton btn2 = new JButton("JLoka Btn-02");

            // define the constraints
            SpringLayout.Constraints btn1c = new SpringLayout.Constraints();            
            SpringLayout.Constraints btn2c = new SpringLayout.Constraints();

            // set the x, y for btn constraints in spring layout (the visible area)
            btn1c.setX(Spring.constant(10));
            btn1c.setY(Spring.constant(20));
            container.add(btn1, btn1c);

//            btn2c.setX(Spring.constant(150));
//            btn2c.setY(Spring.constant(20));
            btn2c.setX(
                Spring.sum(
                    springLayout.getConstraint(SpringLayout.EAST, btn1), 
                    Spring.constant(25)
                )
            );
            btn2c.setY(Spring.constant(20));
            container.add(btn2, btn2c);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
