package simpleswingexample;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JLokaTestGroupLayout {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container container = frame.getContentPane();
            
            GroupLayout groupLayout =  new GroupLayout(container);
            container.setLayout(groupLayout);
            
            JButton btn1 = new JButton("JLoka BTN-01");            
            JButton btn2 = new JButton("JLoka BTN-02");            
            // JButton btn3 = new JButton("JLoka BTN-03");
            // JButton btn4 = new JButton("JLoka BTN-04");

            // we must create Horizontal And Vertical Group For each item in group
            groupLayout.setHorizontalGroup(
                    groupLayout
                        .createSequentialGroup()
                            .addComponent(btn1)
                            .addGap(20)
                            .addComponent(btn2)
            );
            
            groupLayout.setVerticalGroup(
                    groupLayout
                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1)
                            .addGap(10)
                            .addComponent(btn2)
            );
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
