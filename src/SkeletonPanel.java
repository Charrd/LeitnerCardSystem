import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkeletonPanel extends JPanel{
    public SkeletonPanel(GraphicalUserInterface gui) {
        JPanel content = getContent();
        JPanel backPanel = new JPanel(new BorderLayout());
        setLayout(new BorderLayout());
        add(content, BorderLayout.CENTER);
        add(backPanel, BorderLayout.SOUTH);

        JButton backButton = new JButton("Back");
        //backButton.setBorder(gui.thickBorder);
        backButton.setFont(new Font(backButton.getFont().getName(), Font.PLAIN, 30));
        backPanel.add(backButton, BorderLayout.CENTER);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("NOOO GO BACK");
                gui.setPanel(new HomePanel(gui));
            }
        });
    }

    protected JPanel getContent() {
        return new JPanel(new BorderLayout());
    }
}
