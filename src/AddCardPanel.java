import javax.swing.*;
import java.awt.*;

public class AddCardPanel extends SkeletonPanel {


    public AddCardPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        JLabel test = new JLabel("FOO");
        contentPanel.add(test);
        return contentPanel;
    }
}
