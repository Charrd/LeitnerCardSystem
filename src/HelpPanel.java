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
        JLabel test = new JLabel("DABDABDAB");
        test.setFont(new Font(test.getFont().getName(), Font.PLAIN, 300));
        contentPanel.add(test);
        return contentPanel;
    }
}
