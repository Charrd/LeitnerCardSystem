import javax.swing.*;
import java.awt.*;

public class AddCardPanel extends SkeletonPanel {


    public AddCardPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(14283517));
        JLabel test = new JLabel("FOO");
        contentPanel.add(test, BorderLayout.WEST);
        JTextField contentParagraph = new JTextField();
        contentPanel.add(contentParagraph, BorderLayout.CENTER);
        return contentPanel;
    }
}
