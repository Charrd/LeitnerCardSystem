import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SkeletonPanel extends JPanel{
    public SkeletonPanel(GraphicalUserInterface gui) {

        //set consistent layout for all panels
        JPanel content = getContent();
        JPanel backPanel = new JPanel(new BorderLayout());
        setLayout(new BorderLayout());
        add(content, BorderLayout.CENTER);
        add(backPanel, BorderLayout.SOUTH);
        content.setBackground(new Color(14283517));
        backPanel.setBackground(new Color(14283517));

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font(backButton.getFont().getName(), Font.PLAIN, 30));
        backPanel.add(backButton, BorderLayout.CENTER);
        backButton.setBackground(new Color(8703723));

        //back button that has a pop up to check you want to go back
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to return to home?", "Confirmation for return", dialogButton);
                if(dialogResult == 0) {
                    gui.setPanel(new HomePanel(gui));
                }
            }
        });
    }

    //to be expanded on in each specific panel
    protected JPanel getContent() {
        return new JPanel(new BorderLayout());
    }
}
