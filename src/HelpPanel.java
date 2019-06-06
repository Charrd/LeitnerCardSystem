import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPanel extends SkeletonPanel {


    public HelpPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        JPanel helpInfoPanel = new JPanel(new BorderLayout());
        contentPanel.add(helpInfoPanel);
        JLabel title = new JLabel("DABDABDAB");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        JTextArea contentParagraph = new JTextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
        contentParagraph.setFont(new Font(contentParagraph.getFont().getName(), Font.PLAIN, 20));
        contentParagraph.setLineWrap(true);
        helpInfoPanel.add(title, BorderLayout.NORTH);
        helpInfoPanel.add(contentParagraph, BorderLayout.CENTER);
        return contentPanel;
    }
}






