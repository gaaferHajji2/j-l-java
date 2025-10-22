package simpleswingexample;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JLokaTestNestedGroups {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLoka Test Nested Groups");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = frame.getContentPane();
            GroupLayout groupLayout = new GroupLayout(container);
            groupLayout.setAutoCreateGaps(true);
            groupLayout.setAutoCreateContainerGaps(true);
            
            container.setLayout(groupLayout);
            
            JButton btn1 = new JButton("JLoka Btn-01");
            JButton btn2 = new JButton("JLoka Long Text Btn-02");
            JButton btn3 = new JButton("JLoka Btn-03");
            JButton btn4 = new JButton("JLoka Btn-04");
            
             groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btn1)
                        .addComponent(btn3))
                    .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(btn2)
                        .addComponent(btn4))
        );
             
        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3)
                    .addComponent(btn4))
        );
        
        groupLayout.linkSize(btn1, btn2, btn3, btn4);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
    
}
